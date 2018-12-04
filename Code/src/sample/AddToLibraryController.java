package sample;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddToLibraryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text errorText;

    @FXML
    private TextField pathTextField;

    @FXML
    private Button okButton;

    @FXML
    void initialize() {
        okButton.setOnAction(event -> {
            String path = pathTextField.getText();
            File f = new File(path);
            String name = f.getName();
            if(f.isFile()) {
                errorText.setText("");
                if(!AllMovies.isCreated()) {
                    AllMovies allMovies = new AllMovies(path, name);
                } else {
                    AllMovies.add(path, name);
                }
                Film film = AllMovies.findFilm(name);
                System.out.println(film.getPath());
                Stage stageTheButtonBelongs = (Stage) okButton.getScene().getWindow();
                stageTheButtonBelongs.close();
            } else {
                errorText.setText("Wrong path!");
            }

        });
    }
}