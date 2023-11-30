
import java.util.*;
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
import javafx.collections.FXCollections;

public class CountriesCapitalsGUI3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Countries CAPITALS");
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 600, 400);
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

    ColumnConstraints columnTwoConstrains = new ColumnConstraints(100,100, Double.MAX_VALUE);
    columnTwoConstrains.setHgrow(Priority.ALWAYS);

    gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

    return gridPane;
}

private void addUIControls(GridPane gridPane) {
    Countries3 cMap = new Countries3();
    ArrayList<String> cNames = cMap.getCountriesNamesList();
    // Add Header
    Label headerLabel = new Label("Countries CAPITALS");
    headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
    gridPane.add(headerLabel, 0,0,2,1);
    GridPane.setHalignment(headerLabel, HPos.CENTER);
    GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

    final ComboBox<String> comboBox = new ComboBox<String>(FXCollections.observableArrayList(cNames));
    // comboBox.getItems().addAll("Gregor", "Tadeja", "Zala", "Mark", "Spela");
    comboBox.setPrefWidth(200.0);

    // new for autocomplete
    comboBox.setTooltip(new Tooltip());
    new ComboBoxAutoComplete<String>(comboBox);

    comboBox.getSelectionModel().selectFirst();
    GridPane.setHalignment(comboBox, HPos.LEFT);
    gridPane.add(comboBox, 1, 1, 2, 1);

    // -----------------------------------------------------
    Label countryLabel = new Label("Country name : ");
    gridPane.add(countryLabel, 0,2);

    TextField countryField = new TextField();
    // nameField.setPrefHeight(40);
    gridPane.add(countryField, 1,2);
    // -----------------------------------------------------
    Label capitalLabel = new Label("Capital : ");
    gridPane.add(capitalLabel, 0,3);

    TextField capitalField = new TextField();
    // birthDateField.setPrefHeight(40);
    gridPane.add(capitalField, 1,3);
    // -----------------------------------------------------
    Label codeLabel = new Label("Country code : ");
    gridPane.add(codeLabel, 0, 4);

    TextField codeField = new TextField();
    // EMSOField.setPrefHeight(40);
    gridPane.add(codeField, 1, 4);
    // -----------------------------------------------------
    Label continentLabel = new Label("Continent : ");
    gridPane.add(continentLabel, 0, 5);

    TextField continentField = new TextField();
    // DSField.setPrefHeight(40);
    gridPane.add(continentField, 1, 5);
    // -----------------------------------------------------


    // Add Submit Button
    Button submitButton = new Button("Print Country info");
    // submitButton.setPrefHeight(40);
    submitButton.setDefaultButton(true);
    // submitButton.setPrefWidth(100);
    gridPane.add(submitButton, 0, 8, 2, 1);
    GridPane.setHalignment(submitButton, HPos.CENTER);
    GridPane.setMargin(submitButton, new Insets(20, 0, 20, 0));


    submitButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Country found = cMap.getCountry((String) comboBox.getValue());

            countryField.setText(found.getCountryName());
            capitalField.setText(found.getCapitalName());
            codeField.setText(found.getCountryCode());
            continentField.setText(found.getContinentName());

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