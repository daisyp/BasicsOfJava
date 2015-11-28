package javafx;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import java.awt.Label;

import javafx.geometry.*;

public class ConfirmBox {

	static boolean answer;
	
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);
		
		//Create two buttons
		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");
		
		yesButton.setOnAction(e -> {
		     answer = true;
		     window.close();
		});
		
		noButton.setOnAction(e -> {
		     answer = false;
		     window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	}
}
