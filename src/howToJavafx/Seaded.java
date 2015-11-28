package howToJavafx;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Seaded extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Heyyyy");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));


        /* Person daisy = new Person();
        *daisy.firstNameProperty().addListener( (v, oldValue, newValue) -> {
            *System.out.println("Name changed to " + newValue);
            *System.out.println("firstNameProperty(): " + daisy.firstNameProperty());
            *System.out.println("getFirstName(): " + daisy.getFirstName());
         });
         */

        button = new Button("Submit");
        // button.setOnAction(e -> daisy.setFirstName("DUMB"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
