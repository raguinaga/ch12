package firstGui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class VBoxes extends Application {

    @Override
    public void start(Stage stage) {
        // Create the images
        Image moon = new Image("file:D:\\java\\twelveRedux\\images\\Moon.jpg");
        Image ship = new Image("file:D:\\java\\twelveRedux\\images\\Ship.jpg");
        Image sunset = new Image("file:D:\\java\\twelveRedux\\images\\Sunset.jpg");

        // Create the image views
        ImageView moonView = new ImageView(moon);
        ImageView shipView = new ImageView(ship);
        ImageView sunsetView = new ImageView(sunset);

        // Resize moon image
        moonView.setFitWidth(200);
        moonView.setPreserveRatio(true);

        // Resize ship image
        shipView.setFitWidth(200);
        shipView.setPreserveRatio(true);

        // Resize sunset image
        sunsetView.setFitWidth(200);
        sunsetView.setPreserveRatio(true);

        // Put images in VBox, with 10 px spacing
        VBox vbox = new VBox(10, moonView, shipView, sunsetView);

        // set 30 pixels padding around vbox
        vbox.setPadding(new Insets(30));

        //Create the scene
        Scene scene = new Scene(vbox);

        //Set the stage
        stage.setScene(scene);
        stage.setTitle("Vbox images");
        stage.show();
    }

    //Main launches gui
    public static void main(String[] args) {
        launch(args);
    }
}
