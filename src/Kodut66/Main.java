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

/**
 * Created by Daisy on 28.11.2015.
 */
public class Main extends Application {

    Stage window;
    TableView<Input> table;
    TextField t66tyypInput,aineInput,toimumiskohtInput,ruumInput,kuup2evInput;

    //Toob programmi esile
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Organiseerija");
        final Label label = new Label ("Ajaplaneerija");
        label.setFont(new Font("Arial", 20));


        //Töö tüübi veerg
        TableColumn<Input, String> t66tyypColumn = new TableColumn<>("Töö tüüp");
        t66tyypColumn.setMinWidth(200);
        t66tyypColumn.setCellValueFactory(new PropertyValueFactory<>("töö tüüp"));

        //Aine veerg
        TableColumn<Input, String> aineColumn = new TableColumn<>("Aine");
        aineColumn.setMinWidth(150);
        aineColumn.setCellValueFactory(new PropertyValueFactory<>("aine"));


        //Toimumiskoha veerg
        TableColumn<Input, String> toimumiskohtColumn = new TableColumn<>("Toimumiskoht");
        toimumiskohtColumn.setMinWidth(200);
        toimumiskohtColumn.setCellValueFactory(new PropertyValueFactory<>("toimumiskoht"));

        //Ruum veerg
        TableColumn<Input, String> ruumColumn = new TableColumn<>("Ruum");
        ruumColumn.setMinWidth(100);
        ruumColumn.setCellValueFactory(new PropertyValueFactory<>("ruum"));

        //Kuupäeva veerg
        TableColumn<Input, String> kuup2evColumn = new TableColumn<>("Kuupäev");
        kuup2evColumn.setMinWidth(150);
        kuup2evColumn.setCellValueFactory(new PropertyValueFactory<>("kuupäev"));

        //Sisestab töö tüübi
        t66tyypInput = new TextField();
        t66tyypInput.setPromptText("Töö tüüp");
        t66tyypInput.setMinWidth(100);

        //Sisestab aine
        aineInput = new TextField();
        aineInput.setPromptText("Aine");
        aineInput.setMinWidth(100);

        //Sisestab toimumiskoha
        toimumiskohtInput = new TextField();
        toimumiskohtInput.setPromptText("Toimumiskoht");
        toimumiskohtInput.setMinWidth(100);

        //Sisestab ruumi
        ruumInput = new TextField();
        ruumInput.setPromptText("Ruum");
        ruumInput.setMinWidth(100);

        //Sisestab kuupäeva
        kuup2evInput = new TextField();
        kuup2evInput.setPromptText("dd/mm/yyyy");
        kuup2evInput.setMinWidth(100);

        //Lisa juurde töid ja kustuta tehtud tööd
        Button lisaButton = new Button("Lisa juurde");
        lisaButton.setOnAction(e -> lisaButtonVajutatud());
        Button kustutaButton = new Button("Tehtud!");
        kustutaButton.setOnAction(e -> kustutaButtonVajutatud());


        //Tabel
        table = new TableView<>();
        table.setItems(getInput());
        table.getColumns().addAll(t66tyypColumn, aineColumn, toimumiskohtColumn, ruumColumn, kuup2evColumn);

        // Horisontaalne
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(t66tyypInput, aineInput, toimumiskohtInput, ruumInput, kuup2evInput, lisaButton, kustutaButton);

        // Vertikaalne
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    // Kui vajutad "Lisa", siis lisab järgnevad asjad
    public void lisaButtonVajutatud() {
        Input input = new Input();
        input.setT66tyyp(t66tyypInput.getText());
        input.setAine(aineInput.getText());
        input.setToimumiskoht(toimumiskohtInput.getText());
        input.setRuum(Integer.parseInt(ruumInput.getText()));
        input.setKuup2ev(kuup2evInput.getText());
        table.getItems().add(input);
        t66tyypInput.clear();
        aineInput.clear();
        toimumiskohtInput.clear();
        ruumInput.clear();
        kuup2evInput.clear();
    }

    // Kustutab listist tehtud sündmuse
    public void kustutaButtonVajutatud() {
        ObservableList<Input> inputM22ratud, k6ikInputs;
        k6ikInputs = table.getItems();
        inputM22ratud = table.getSelectionModel().getSelectedItems();

        inputM22ratud.forEach(k6ikInputs::remove);
    }



    // saad kõik andmed
    public ObservableList<Input> getInput() {
        ObservableList<Input> andmed = FXCollections.observableArrayList();// siin listis storeb kõiki andmeid
        andmed.add(new Input("Eksam", "Makroökonoomika", "ITK", 221, "04/01/2015"));
        andmed.add(new Input("Arvestus", "Sissejuhatus Informaatikasse", "ITK", 306, "02/01/2015"));
        andmed.add(new Input("Eksam", "Java", "ITK", 205, "17/01/2015"));
        andmed.add(new Input("Eksam", "Mat.analüüs", "ITK", 304, "07/01/2015"));
        return andmed;
    }
}
