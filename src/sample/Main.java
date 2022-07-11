package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final double STAGE_HEIGHT = 400;
    public static final double STAGE_WIDTH = 600;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainStage.fxml"));
        primaryStage.setTitle("Totally Awesome Height Calculator 6000");
        primaryStage.setScene(new Scene(root, STAGE_WIDTH, STAGE_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
