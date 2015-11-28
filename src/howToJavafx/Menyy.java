package howToJavafx;


import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Menyy extends Application {

    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Daisy learns new things");

        // file menu
        Menu fileMenu = new Menu("file");

        // menu items
        MenuItem newFile = new MenuItem("new...");
        newFile.setOnAction(e -> System.out.println("create a new file"));
        fileMenu.getItems().add(newFile);

        fileMenu.getItems().add(new MenuItem("new..."));
        fileMenu.getItems().add(new MenuItem("open..."));
        fileMenu.getItems().add(new MenuItem("save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("exit..."));

        // edit menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("cut"));
        editMenu.getItems().add(new MenuItem("copy"));
        editMenu.getItems().add(new MenuItem("paste"));

        MenuItem paste = new MenuItem("paste");
        paste.setOnAction(e -> System.out.println("paste some blabla file"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        // help menu
        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Hiding line numbers");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        // difficulty RaidoMenuItems
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);


        // main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
