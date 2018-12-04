package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RecentlyViewedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button playlistsButton;

    @FXML
    private Label viewedTime3Label;

    @FXML
    private Label allMovies3Label;

    @FXML
    private Label viewedTime2Label;

    @FXML
    private Button homeButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button favoriteButton;

    @FXML
    private Label allMovies2Label;

    @FXML
    private Label viewedTime4Label;

    @FXML
    private Label allMovies1Label;

    @FXML
    private Button recentlyViewedButton;

    @FXML
    private Label viewedTime1Label;

    @FXML
    private Label allMovies4Label;

    @FXML
    private Button allMoviesButton;

    @FXML
    void initialize() {
       homeButton.setOnAction(event -> {
               try {
                   Stage stageTheButtonBelongs = (Stage) homeButton.getScene().getWindow();
                   Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
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