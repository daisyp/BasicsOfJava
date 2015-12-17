package Kodut66;

import javafx.ConfirmBox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.Printer;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.prefs.Preferences;

/**
 * Created by Daisy
 */
public class Main extends Application {

    Stage window;
    TableView<Input> table;
    TextField aineInput, ruumInput, dateInput;

    // Toob programmi esile
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tere tulemast!");
        final Label label = new Label("Ajaplaneerija");
        label.setTextFill(Color.MAROON);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox labelHb = new HBox();
        labelHb.setAlignment(Pos.CENTER);
        labelHb.getChildren().add(label);


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
        dateInput.setPromptText("yyyy.mm.dd");
        dateInput.setMinWidth(100);


        // Lisamis- ja kustutamisnupp, kontrollimisnupp
        Button addButton = new Button("Lisa juurde");
        addButton.setOnAction(e -> addButtonClicked());
        Button delButton = new Button("Tehtud!");
        delButton.setOnAction(e -> delButtonClicked());
        Button checkButton = new Button("KONTROLLI!");
        checkButton.setOnAction(e -> DateComp());


        // Horisontaalne
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(30);
        hBox.getChildren().addAll(aineInput, ruumInput, dateInput, addButton, delButton, checkButton);

        // Tabel
        table = new TableView<>();
        table.setItems(getInput());
        table.getColumns().addAll(aineColumn, ruumColumn, dateColumn);

        // Vertikaalne
        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelHb, table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

        // laeb andmed
        loadData();
    }

    // "Lisa" nupu vajutamine
    public void addButtonClicked() {
        Input input = new Input();
        input.setAine(aineInput.getText());
        try {
            input.setRuum(Integer.parseInt(ruumInput.getText()));
        } catch (NumberFormatException e) {
            System.out.println("Ei ole number. Palun sisesta uuesti.");
        }
        input.setDate(dateInput.getText());
        table.getItems().add(input);
        aineInput.clear();
        ruumInput.clear();
        dateInput.clear();
        // Salvestab andmed
        saveData();
    }


    // "Tehtud!" nupu vajutamine
    public void delButtonClicked() {
        ObservableList<Input> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        ConfirmDone done = new ConfirmDone();
        if (done.display("Kustuta", "Oled kindel, et said tehtud?") == true) {
            productSelected.forEach(allProducts::remove);
        }

    }

    // Hoiab kogu andmestikku
    public ObservableList<Input> getInput() {
        ObservableList<Input> inputs = FXCollections.observableArrayList();
        return inputs;
    }

    // Testib tähtaegu
    public void DateComp() {
        ObservableList<Input> allHomeworks;
        allHomeworks = table.getItems();
        Date date = new Date();
        SimpleDateFormat dateAtm = new SimpleDateFormat("yyyy.MM.dd");
        for (Input homework : allHomeworks) {
            // Kontrollib, kas täna on töö või mitte
            if (homework.getDate().equals(dateAtm.format(date))) {
                System.out.println(homework.getAine() + " " + homework.getRuum() + " " + homework.getDate());
                // Kasutan Deadline.java klassi
                Boolean answer = Deadline.display("HÄIRE!", "Sul on täna " + homework.getAine() + ". Vaata õppematerjalid üle!");

            }

        }
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

    // Andmestiku salvestamine
    public void saveData() {
        ObservableList<Input> allHomeworks = table.getItems();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("Homeworks.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for(Input homework : allHomeworks) {
            writer.println(homework.getAine() + "\t" + homework.getRuum() +  "\t" + homework.getDate());
        }
        writer.close();
    }

    // Andmestiku lugemine tagasi
    public void loadData() {
        try (Scanner scanner = new Scanner(new File("Homeworks.txt"))) {

            while (scanner.hasNext()){
                String[] parts = scanner.nextLine().split("\t");
                Input input = new Input();
                input.setAine(parts[0]);
                input.setRuum(Integer.parseInt(parts[1]));
                input.setDate(parts[2]);
                table.getItems().add(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
