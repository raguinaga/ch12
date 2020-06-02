package firstGui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageBoxes extends Application {

    // override start
    @Override
    public void start(Stage stage) {
        // Create images
        Image moon = new Image("file:D:\\java\\twelveRedux\\images\\Moon.jpg");
        Image ship = new Image("file:D:\\java\\twelveRedux\\images\\Ship.jpg");
        Image sunset = new Image("file:D:\\java\\twelveRedux\\images\\Sunset.jpg");

        // Create imageviews
        ImageView moonView = new ImageView(moon);
        ImageView shipView = new ImageView(ship);
        ImageView sunsetView = new ImageView(sunset);

        // Resize the moon image, preserve aspect ratio
        moonView.setFitWidth(200);
        moonView.setPreserveRatio(true);

        // Resize the ship image, preserve aspect ratio
        shipView.setFitWidth(200);
        shipView.setPreserveRatio(true);

        //Resize sunset image, preserve aspect ratio
        sunsetView.setFitWidth(200);
        sunsetView.setPreserveRatio(true);

        // Put all images in a HBOX
        HBox hbox = new HBox(10,moonView, shipView, sunsetView);

        // Create the scene with the hbox as the root node
        Scene scene = new Scene(hbox);

        // put scene on stage
        stage.setScene(scene);
        stage.setTitle("images");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}