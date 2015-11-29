package Kodut66;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.*;
import java.util.Date;

/**
 * Created by Daisy on 28.11.2015.
 */
public class Main extends Application {

    Stage window;
    TableView<Input> table;
    TextField aineInput, ruumInput, dateInput ;

    // Toob programmi esile
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Organiseerija");
        final javafx.scene.control.Label label = new javafx.scene.control.Label("Ajaplaneerija");
        label.setFont(new Font("Arial", 20));

        // Aine veerg
        TableColumn<Input, String> aineColumn = new TableColumn<>("Aine");
        aineColumn.setMinWidth(200);
        aineColumn.setCellValueFactory(new PropertyValueFactory<>("aine"));

        // Ruumi veerg
        TableColumn<Input, String> ruumColumn = new TableColumn<>("Ruum");
        ruumColumn.setMinWidth(200);
        ruumColumn.setCellValueFactory(new PropertyValueFactory<>("ruum"));

        // Kuupäeva veerg
        TableColumn<Input, String> dateColumn = new TableColumn<>("Date");
        dateColumn.setMinWidth(200);
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Sisestab aine
        aineInput = new TextField();
        aineInput.setPromptText("Aine");
        aineInput.setMinWidth(100);

        // Sisestab ruumi
        ruumInput = new TextField();
        ruumInput.setOnAction(e -> ruumInt(ruumInput, ruumInput.getText()));
        ruumInput.setPromptText("Ruum");
        ruumInput.setMinWidth(100);

        // Sisestab kuupäeva
        dateInput = new TextField();
        dateInput.setPromptText("dd.mm.yyyy");
        dateInput.setMinWidth(100);

        // Lisamis- ja kustutamisnupp
        Button addButton = new Button("Lisa juurde");
        addButton.setOnAction(e -> addButtonClicked());
        Button delButton = new Button("Tehtud!");
        delButton.setOnAction(e -> delButtonClicked());

        // Horisontaalne
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(aineInput, ruumInput, dateInput,  addButton, delButton);

        // Tabel
        table = new TableView<>();
        table.setItems(getInput());
        table.getColumns().addAll(aineColumn, ruumColumn,  dateColumn);

        // Vertikaalne
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    // "Lisa" nupu vajutamine
    public void addButtonClicked() {
        Input input = new Input();
        input.setAine(aineInput.getText());
        input.setRuum(Integer.parseInt(ruumInput.getText()));
        input.setDate(dateInput.getText());
        table.getItems().add(input);
        aineInput.clear();
        ruumInput.clear();
        dateInput.clear();
    }


    // "Tehtud!" nupu vajutamine
    public void delButtonClicked() {
        ObservableList<Input> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }

    // Hoiab kogu andmestikku
    public ObservableList<Input> getInput() {
        ObservableList<Input> inputs = FXCollections.observableArrayList();
        inputs.add(new Input("Makroökonoomika", 302, "04.01.2016"));
        inputs.add(new Input("Java", 221, "12.01.2016"));
        inputs.add(new Input("Infotöötlus", 306, "17.12.2015"));
        return inputs;

    }

    // Kontrollib kas on sisestatud ruumi number
    private boolean ruumInt(TextField input, String message) {
        try {
            int ruum = Integer.parseInt(input.getText());
            System.out.println("Ruumi number " + ruum + " on sisestatud korrektselt");
            return true;
        } catch (NumberFormatException e) {
            System.out.println(message);
            return false;
        }
    }


}
