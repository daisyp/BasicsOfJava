package javafx;

import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CloseProgram extends Application {

	Stage window;
	Button button;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Its me mario");
		
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		
		button = new Button("Close program");
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Title", "Sure u wanna exit?");
		if(answer) 
			window.close();
	}

}
