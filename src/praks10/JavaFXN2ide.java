package praks10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXN2ide extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX-iga joonistamise näide");
		Group root = new Group();
		Canvas canvas = new Canvas(400, 400);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		joonista(gc);
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	private void joonista(GraphicsContext gc) {
		gc.setFill(Color.GREEN);
		gc.setStroke(Color.BLUE);
		gc.setLineWidth(5);
		gc.fillRoundRect(50, 50, 300, 300, 40, 40);
		gc.strokeLine(100, 300, 300, 300);
		gc.strokeOval(100, 100, 50, 50);
		gc.strokeOval(250, 100, 50, 50);
		gc.setFill(Color.RED);
		gc.fillRoundRect(175, 200, 50, 50, 10, 10);
		gc.fillText("Olen roheline mehike Marsilt", 100, 370);
	}
}
