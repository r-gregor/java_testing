package com.example.gui2;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;

// NEW
import com.example.programming2.ProgrammingQuotes2;

public class QuoteFxApp2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Quotes");

        // NEW
        // Label label = new Label("A quote");
        Label label = new Label(new ProgrammingQuotes2().getQuote());
        Scene scene = new Scene(label, 500, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
