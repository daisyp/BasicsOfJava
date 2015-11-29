package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main4 extends Application {

	Stage window;
	TableView<Kodut66.Input> table;
	TextField aineInput,ruumInput,dateInput;

	//Toob programmi esile
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Organiseerija");
		final javafx.scene.control.Label label = new javafx.scene.control.Label("Ajaplaneerija");
		label.setFont(new Font("Arial", 20));


		//Aine veerg
		TableColumn<Kodut66.Input, String> aineColumn = new TableColumn<>("Aine");
		aineColumn.setMinWidth(150);
		aineColumn.setCellValueFactory(new PropertyValueFactory<>("aine"));


		//Ruum veerg
		TableColumn<Kodut66.Input, String> ruumColumn = new TableColumn<>("Ruum");
		ruumColumn.setMinWidth(100);
		ruumColumn.setCellValueFactory(new PropertyValueFactory<>("ruum"));

		//Kuupäeva veerg
		TableColumn<Kodut66.Input, String> dateColumn = new TableColumn<>("Kuupäev");
		dateColumn.setMinWidth(150);
		dateColumn.setCellValueFactory(new PropertyValueFactory<>("kuupäev"));


		//Sisestab aine
		aineInput = new TextField();
		aineInput.setPromptText("Aine");
		aineInput.setMinWidth(100);


		//Sisestab ruumi
		ruumInput = new TextField();
		ruumInput.setPromptText("Ruum");
		ruumInput.setMinWidth(100);

		//Sisestab kuupäeva
		dateInput = new TextField();
		dateInput.setPromptText("dd/mm/yyyy");
		dateInput.setMinWidth(100);

		//Lisa juurde töid ja kustuta tehtud tööd
		Button lisaButton = new Button("Lisa juurde");
		lisaButton.setOnAction(e -> lisaButtonVajutatud());
		Button kustutaButton = new Button("Tehtud!");
		kustutaButton.setOnAction(e -> kustutaButtonVajutatud());


		//Tabel
		table = new TableView<>();
		table.setItems(getInput());
		table.getColumns().addAll( aineColumn, ruumColumn, dateColumn);

		// Horisontaalne
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(aineInput, ruumInput, dateInput, lisaButton, kustutaButton);

		// Vertikaalne
		VBox vBox = new VBox();
		vBox.getChildren().addAll(label, table, hBox);

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}

	// Kui vajutad "Lisa", siis lisab järgnevad asjad
	public void lisaButtonVajutatud() {
		Kodut66.Input input = new Kodut66.Input();
		input.setAine(aineInput.getText());
		input.setRuum(Integer.parseInt(ruumInput.getText()));
		input.setDate(dateInput.getText());
		table.getItems().add(input);
		aineInput.clear();
		ruumInput.clear();
		dateInput.clear();
	}

	// Kustutab listist tehtud sündmuse
	public void kustutaButtonVajutatud() {
		ObservableList<Kodut66.Input> inputM22ratud, k6ikInputs;
		k6ikInputs = table.getItems();
		inputM22ratud = table.getSelectionModel().getSelectedItems();

		inputM22ratud.forEach(k6ikInputs::remove);
	}



	// saad kõik andmed
	public ObservableList<Kodut66.Input> getInput() {
		ObservableList<Kodut66.Input> andmed = FXCollections.observableArrayList();// siin listis storeb kõiki andmeid
		andmed.add(new Kodut66.Input("Makroökonoomika", 302, "04.01.2016"));
		andmed.add(new Kodut66.Input("Füüsika", 221, "10.12.2015"));
		andmed.add(new Kodut66.Input("Java", 304, "12.01.2016"));
		andmed.add(new Kodut66.Input("Infotöötlus", 306, "17.12.2015"));
		return andmed;
	}
}