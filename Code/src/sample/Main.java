/**
 * Bt Nikita Us, 2018
 */




package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static sample.DataBase.load;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        DataBase.load();
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        primaryStage.setTitle("Film Manager");
        primaryStage.setScene(new Scene(root, 508, 323));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}