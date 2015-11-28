package howToJavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckButton extends Application{

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("SaladHub");

        //check boxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Salad");
        CheckBox box3 = new CheckBox("Tuna");
        box2.setSelected(true);

        button = new Button("Order now");
        button.setOnAction(e -> handleOptions(box1, box2, box3));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, box3, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3) {
        String message = "Users order:\n  ";

        if(box1.isSelected())
            message += "bacon";

        if(box2.isSelected())
            message += "salad";

        if(box3.isSelected())
            message += "tuna";

        System.out.print(message);
    }
}
