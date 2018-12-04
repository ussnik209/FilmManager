package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Text eViewedText;

    @FXML
    private Label rViewedFilm2Label;

    @FXML
    private Button rViewedOpen2Button;

    @FXML
    private Label favorite3Label;

    @FXML
    private Button favoriteOpen3Button;

    @FXML
    private Button homeButton;

    @FXML
    private Button playlistOpen1Button;

    @FXML
    private Button favoriteButton;

    @FXML
    private Text playlistsText;

    @FXML
    private Button favoriteOpen1Button;

    @FXML
    private Label playlist2Label;

    @FXML
    private Label favorite2Label;

    @FXML
    private Button allMoviesButton;

    @FXML
    private Button playlistsButton;

    @FXML
    private Label rViewedFilm1Label;

    @FXML
    private Button rViewedOpen1Button;

    @FXML
    private Button playlistOpen3Button;

    @FXML
    private Label playlist1Label;

    @FXML
    private Button rViewedOpen3Button;

    @FXML
    private Label playlist3Label;

    @FXML
    private Label favorite1Label;

    @FXML
    private Label rViewedFilm3Label;

    @FXML
    private Button playlistOpen2Button;

    @FXML
    private Button favoriteOpen2Button;

    @FXML
    private Text favoriteText;

    @FXML
    private Button recentlyViewedButton;


    @FXML
    void initialize() throws java.io.IOException{
        recentlyViewedButton.setOnAction(event -> {
            try {
                Stage stageTheButtonBelongs = (Stage) recentlyViewedButton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("RecentlyViewed.fxml"));
                stageTheButtonBelongs.setTitle("Film Manager");
                stageTheButtonBelongs.setScene(new Scene(root, 508, 323));
                stageTheButtonBelongs.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        favoriteButton.setOnAction(event -> {
            try {
                Stage stageTheButtonBelongs = (Stage) favoriteButton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Favorite.fxml"));
                stageTheButtonBelongs.setTitle("Film Manager");
                stageTheButtonBelongs.setScene(new Scene(root, 508, 323));
                stageTheButtonBelongs.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        playlistsButton.setOnAction(event -> {
            try {
                Stage stageTheButtonBelongs = (Stage) playlistsButton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Playlists.fxml"));
                stageTheButtonBelongs.setTitle("Film Manager");
                stageTheButtonBelongs.setScene(new Scene(root, 508, 323));
                stageTheButtonBelongs.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        allMoviesButton.setOnAction(event -> {
            try {
                Stage stageTheButtonBelongs = (Stage) allMoviesButton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("AllMovies.fxml"));
                stageTheButtonBelongs.setTitle("Film Manager");
                stageTheButtonBelongs.setScene(new Scene(root, 508, 323));
                stageTheButtonBelongs.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }
}