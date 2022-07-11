package sample;


import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.util.concurrent.TimeUnit;

public class MainStageController {
    @FXML
    private TextField heightInputTextField = new TextField();
    @FXML
    private Button calculateButton = new Button();
    @FXML
    private Label resultLabel = new Label();

    @FXML
    public void initialize(){
        resultLabel.setVisible(false);
    }


    @FXML
    public void calculateHeight(ActionEvent event){
        String input = heightInputTextField.getText();
        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        pause.setOnFinished(e -> {
            resultLabel.setText("Your height is "+input+" cm");
        });

        resultLabel.setText("Calculating...");
        resultLabel.setVisible(true);
        pause.play();

//        try{
//            Thread.sleep(5000);
//        }
//        catch(InterruptedException e){
//            System.out.println("The totally awesome calculation was interrupted.");
//        }


    }

}
