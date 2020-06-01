package firstGui;

import javafx.application.Application; //Abstract class describes a gui app
import javafx.stage.Stage; // The window
import javafx.scene.Scene; // The stuff that goes in a window
import javafx.scene.layout.HBox; // A horizontal container for controls
import javafx.scene.control.Label; // Controls include labels
import javafx.geometry.Pos; // Used for centering stuff.

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Create a label control
        Label label = new Label("Hello World");

        // Create an HBox container and add the label
        HBox hbox = new HBox(label);

        // Create a scene and add the HBox as the root node.
        Scene scene = new Scene(hbox,300,100);

        // Set the hbox to the center position
        hbox.setAlignment(Pos.CENTER);

        stage.setScene(scene);
        stage.setTitle("My first scene");
        stage.show();
    }

    /**
     * Main launches the GUI app*/
    public static void main(String[] args) {
        launch(args);
    }
}