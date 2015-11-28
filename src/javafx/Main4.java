package javafx;

import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main4 extends Application {

	Stage window;
	
	public void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("HEYYYYYYYYYYYYYYY");
		
		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("View");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
		
		VBox leftMenu = new VBox();
		Button buttonD = new Button("D");
		Button buttonE = new Button("E");
		Button buttonF = new Button("F");
		topMenu.getChildren().addAll(buttonD, buttonE, buttonF);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		
		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}

}
