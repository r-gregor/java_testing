// package com.zetcode;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxEx extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {

        var root = new VBox(35);
        root.setPadding(new Insets(10));

        var lbl = new Label();

        var chbox = new ChoiceBox<>(FXCollections.observableArrayList(
                "Ubuntu", "Redhat", "Arch", "Debian", "Mint"));

        SingleSelectionModel<String> model = chbox.getSelectionModel();
        model.selectedItemProperty().addListener((observableValue, s, t1) -> lbl.setText(t1));

        root.getChildren().addAll(chbox, lbl);

        var scene = new Scene(root, 300, 250);

        stage.setTitle("ChoiceBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
