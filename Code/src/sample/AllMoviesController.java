package sample;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AllMoviesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addMovieButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button playlistsButton;

    @FXML
    private Label allMovies3Label;

    @FXML
    private Button favoriteButton;

    @FXML
    private Label allMovies2Label;

    @FXML
    private Label allMovies1Label;

    @FXML
    private Button recentlyViewedButton;

    @FXML
    private Label allMovies4Label;

    @FXML
    private Button homeButton;

    @FXML
    private Button allMoviesButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button open1Button;

    @FXML
    private Button open2Button;

    @FXML
    private Button open3Button;

    @FXML
    private Button open4Button;

    private int page = 0;

    @FXML
    void initialize() {
        for( int i = 4*page; i < page*4 + 4;) {
            allMovies1Label.setText(AllMovies.getFilmName(i++));
            allMovies2Label.setText(AllMovies.getFilmName(i++));
            allMovies3Label.setText(AllMovies.getFilmName(i++));
            allMovies4Label.setText(AllMovies.getFilmName(i++));
        }

        open1Button.setOnAction(event -> {
            String path;
            Film film = AllMovies.findFilm(allMovies1Label.getText());
            if(film != null) {
                path = film.getPath();
                try {
                    File f = new File(path);
                    if (f.isFile()) {
                        Desktop dt = Desktop.getDesktop();
                        dt.open(f);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        open2Button.setOnAction(event -> {
            String path;
            Film film = AllMovies.findFilm(allMovies2Label.getText());
            if(film != null) {
                path = film.getPath();
                try {
                    File f = new File(path);
                    if (f.isFile()) {
                        Desktop dt = Desktop.getDesktop();
                        dt.open(f);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        open3Button.setOnAction(event -> {
            String path;
            Film film = AllMovies.findFilm(allMovies3Label.getText());
            if(film != null) {
                path = film.getPath();
                try {
                    File f = new File(path);
                    if (f.isFile()) {
                        Desktop dt = Desktop.getDesktop();
                        dt.open(f);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        open4Button.setOnAction(event -> {
            String path;
            Film film = AllMovies.findFilm(allMovies4Label.getText());
            if(film != null) {
                path = film.getPath();
                try {
                    File f = new File(path);
                    if (f.isFile()) {
                        Desktop dt = Desktop.getDesktop();
                        dt.open(f);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

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

        addMovieButton.setOnAction( event -> {
            try {
                Stage addMovieStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("AddToLibrary.fxml"));
                addMovieStage.setTitle("Film Manager");
                addMovieStage.setScene(new Scene(root, 373, 166));
                addMovieStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        saveButton.setOnAction(event -> {
            DataBase.save();
        });
    }
}
