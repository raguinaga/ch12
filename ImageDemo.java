package firstGui;

import javafx.application.Application; // Abstract class for a GUI app
import javafx.stage.Stage;             // Window object
import javafx.scene.Scene;             // Stuff to go in the window
import javafx.scene.layout.HBox;       // Horizontal container for the scene
import javafx.scene.image.Image;       // Image object
import javafx.scene.image.ImageView;   // Graphical representation of te image

/**
 * An image demo
 */
public class ImageDemo extends Application {

    @Override
    public void start(Stage stage) {

        // Create an image object
        Image image = new Image("file:D:\\java\\twelveRedux\\images\\HotAirBalloon.jpg");

        // Create an image view object
        ImageView imageView = new ImageView(image);

        // Put the imageView object in an HBox
        HBox hbox = new HBox(imageView);

        // Create a scene with an Hbox as its root node
        Scene scene = new Scene(hbox);

        // Add the scene to the stage
        stage.setScene(scene);

        // Set the stage title
        stage.setTitle("Hot air balloon");

        // show the window
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}