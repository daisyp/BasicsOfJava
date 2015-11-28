package howToJavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Hey extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Hey its me");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//name label
		Label nameLabel = new Label("username");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		// name input
		TextField nameInput = new TextField("Daisy");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//password label
		Label passLabel = new Label("password");
		GridPane.setConstraints(nameLabel, 0, 1);
				
		// password input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		
		window.show();
	}

}
