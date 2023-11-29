
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Gui3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Family member Info");
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

}

private GridPane createRegistrationFormPane() {

    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setPadding(new Insets(40, 40, 40, 40));
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
    columnOneConstraints.setHalignment(HPos.RIGHT);

    ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
    columnTwoConstrains.setHgrow(Priority.ALWAYS);

    gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

    return gridPane;
}

private void addUIControls(GridPane gridPane) {
    // Add Header
    Label headerLabel = new Label("Family member Info");
    headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
    gridPane.add(headerLabel, 0,0,2,1);
    GridPane.setHalignment(headerLabel, HPos.CENTER);
    GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

    final ComboBox<String> comboBox = new ComboBox<String>();
    comboBox.getItems().addAll("Gregor", "Tadeja", "Zala", "Mark", "Spela");
    comboBox.setPrefWidth(200.0);
    comboBox.getSelectionModel().selectFirst();
    GridPane.setHalignment(comboBox, HPos.LEFT);
    gridPane.add(comboBox, 1, 1, 2, 1);

    // -----------------------------------------------------
    Label nameLabel = new Label("Full Name : ");
    gridPane.add(nameLabel, 0,2);

    TextField nameField = new TextField();
    // nameField.setPrefHeight(40);
    gridPane.add(nameField, 1,2);
    // -----------------------------------------------------
    Label birthDateLabel = new Label("Birth date : ");
    gridPane.add(birthDateLabel, 0,3);

    TextField birthDateField = new TextField();
    // birthDateField.setPrefHeight(40);
    gridPane.add(birthDateField, 1,3);
    // -----------------------------------------------------
    Label EMSOLabel = new Label("EMSO : ");
    gridPane.add(EMSOLabel, 0, 4);

    TextField EMSOField = new TextField();
    // EMSOField.setPrefHeight(40);
    gridPane.add(EMSOField, 1, 4);
    // -----------------------------------------------------
    Label DSLabel = new Label("DS : ");
    gridPane.add(DSLabel, 0, 5);

    TextField DSField = new TextField();
    // DSField.setPrefHeight(40);
    gridPane.add(DSField, 1, 5);
    // -----------------------------------------------------
    Label PLLabel = new Label("PL : ");
    gridPane.add(PLLabel, 0, 6);

    TextField PLField = new TextField();
    // PLField.setPrefHeight(40);
    gridPane.add(PLField, 1, 6);
    // -----------------------------------------------------
    Label ZZZSLabel = new Label("ZZZS : ");
    gridPane.add(ZZZSLabel, 0, 7);

    TextField ZZZSField = new TextField();
    // ZZZSField.setPrefHeight(40);
    gridPane.add(ZZZSField, 1, 7);
    // -----------------------------------------------------


    // Add Submit Button
    Button submitButton = new Button("Submit");
    submitButton.setPrefHeight(40);
    submitButton.setDefaultButton(true);
    submitButton.setPrefWidth(100);
    gridPane.add(submitButton, 0, 8, 2, 1);
    GridPane.setHalignment(submitButton, HPos.CENTER);
    GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

    /*
    Family fm = new Family();
    Person found = fm.getPersonInfo((String) comboBox.getValue());
    */
    



    submitButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Family3 fm3 = new Family3();
            Person found = fm3.getPersonInfo((String) comboBox.getValue());

            nameField.setText(found.Ime + " " + found.Priimek);
            birthDateField.setText(found.RD);
            EMSOField.setText(found.EMSO);
            DSField.setText(found.DS);
            PLField.setText(found.PL);
            ZZZSField.setText(found.ZZZS);
        }
    });
}

private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.initOwner(owner);
    alert.show();
}

    public static void main(String[] args) {
        launch(args);
    }
}