
// from: http://www.learningaboutelectronics.com/Articles/Select-all-that-apply-test-question-in-JavaFX.php

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class RadioButtons2 extends Application {

    static String result[];

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quiz Question 1");

        Label labelfirst= new Label("What of the following are animals?");
        Label labelresponse= new Label();

        Button button= new Button("Submit");

        CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
        checkbox1=new CheckBox("Pillow");
        checkbox2= new CheckBox("Tiger");
        checkbox3= new CheckBox("Lion");
        checkbox4= new CheckBox("Bed");
        checkbox5= new CheckBox("Bear");

        button.setDisable(true);

        checkbox1.setOnAction(e -> button.setDisable(false) );
        checkbox2.setOnAction(e -> button.setDisable(false) );
        checkbox3.setOnAction(e -> button.setDisable(false) );
        checkbox4.setOnAction(e -> button.setDisable(false) );
        checkbox5.setOnAction(e -> button.setDisable(false) );

        button.setOnAction(e -> {
            if ((checkbox2.isSelected()) && (checkbox3.isSelected()) && (checkbox5.isSelected())) {
                labelresponse.setText("Correct answer");
                button.setDisable(true);

            } else {
                labelresponse.setText("Wrong answer");
                button.setDisable(true);
            }
        });
        VBox layout= new VBox(5);

        layout.getChildren().addAll(labelfirst, checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, button, labelresponse);
        Scene scene1= new Scene(layout, 400, 250);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}