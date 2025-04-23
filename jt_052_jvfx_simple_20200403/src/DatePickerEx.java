// package com.zetcode;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        var root = new VBox(15);
        root.setPadding(new Insets(10));

        var lbl = new Label("...");

        var datePicker = new DatePicker();

        datePicker.setOnAction(e -> {

            var date = datePicker.getValue();
            lbl.setText(date.toString());
        });

        root.getChildren().addAll(datePicker, lbl);

        var scene = new Scene(root, 350, 200);

        stage.setTitle("Date picker");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
