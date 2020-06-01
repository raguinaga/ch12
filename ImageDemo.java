package firstGui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * An image demo
 */
public class ImageDemo extends Application {

    @Override
    public void start(Stage stage) {
        
        // Create an image object
        Image image = new Image("file:HotAirBalloon.png");

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