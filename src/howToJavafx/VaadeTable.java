package howToJavafx;

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
import javafx.stage.Stage;

public class VaadeTable extends Application {

    Stage window;
    TableView<Product> table;
    TextField nameInput, priceInput, amountInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Welcome!");

        // name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> amountColumn = new TableColumn<>("Amount");
        amountColumn.setMinWidth(100);
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        //name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);

        amountInput = new TextField();
        amountInput.setPromptText("Amount");
        amountInput.setMinWidth(100);

        // add or delete button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button delButton = new Button("Delete");
        delButton.setOnAction(e -> delButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, amountInput, addButton, delButton);



        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, amountColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Add button clicked
    public void addButtonClicked() {
        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setAmount(Integer.parseInt(amountInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        amountInput.clear();
    }

    // delete button clicked
    public void delButtonClicked() {
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }

    // get all of the products
    public ObservableList<Product> getProduct() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 869.00, 39));
        products.add(new Product("Toilet", 469.00, 39));
        products.add(new Product("Tv", 89.70, 3));
        products.add(new Product("boom", 89.00, 239));
        products.add(new Product("mic", 869.99, 49));
        products.add(new Product("holy shit", 89.30, 899));
        return products;

    }
}
