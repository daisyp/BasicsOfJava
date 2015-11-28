package praks10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Karu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX-iga joonistamise n2ide");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        joonistaKaru(gc);
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

    private void joonistaKaru(GraphicsContext gc){
        gc.setFill(Color.BROWN);
        // x pos, y pos , width, heigth
        //kere
        gc.fillOval(150, 150, 100, 150);
        // pea
        gc.fillOval(160, 80, 80, 80);
        // vasak kõrv
        gc.fillOval(150, 60, 40, 40);
        // parem kõrv
        gc.fillOval(210, 60, 40, 40);
        // vasak käpp
        gc.fillOval(120, 140, 50, 50);
        // parem käpp
        gc.fillOval(230, 140, 50, 50);
        // vasak jalg
        gc.fillOval(120, 260, 60, 60);
        // parem jalg
        gc.fillOval(220, 260, 60, 60);
        //värvivahetus
        gc.setFill(Color.BLACK);
        //nina
        gc.fillOval(192.5, 110, 15, 15);
        //naba
        gc.fillOval(195, 250, 10, 10);
        // suu
        gc.strokeLine(190, 135, 210, 135);
        //värvivahetus
        gc.setFill(Color.BLUE);
        // vasak silm
        gc.fillOval(180, 100, 10, 10);
        // parem silm
        gc.fillOval(210, 100, 10, 10);

        //tekst
        gc.fillText("M6mmi", 180, 370);
    }
}
