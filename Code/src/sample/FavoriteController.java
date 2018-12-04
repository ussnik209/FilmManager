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

public class FavoriteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button nextButton;

    @FXML
    private Button playlistsButton;

    @FXML
    private Button favoriteButton;

    @FXML
    private Label filmFavorite1Label;

    @FXML
    private Label filmFavorite2Label;

    @FXML
    private Button recentlyViewedButton;

    @FXML
    private Label filmFavorite3Label;

    @FXML
    private Label allMovies4Label;

    @FXML
    private Button homeButton;

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
