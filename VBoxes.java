package firstGui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class VBoxes extends Application {

	// Override start
	@Override
	public void start(Stage stage) {
		// Create the images
		Image moonImage = new Image("file:~/dev/java/school/twelveRedux/ch12/images/Moon.jpg");
		Image shipImage = new Image("file:~/dev/java/school/twelveRedux/ch12/images/Ship.jpg");
		Image sunsetImage = new Image("file:~/dev/java/school/twelveRedux/ch12/images/Sunset.jpg");

		// Create the image view objects
		ImageView moonView = new ImageView(moonImage);
		ImageView shipView = new ImageView(shipImage);
		ImageView sunsetView = new ImageView(sunsetImage);

		// Change size of Images, keep aspect ratio the same
		moonView.setFitWidth(200);
		shipView.setFitWidth(200);
		sunsetView.setFitWidth(200);
		moonView.setPreserveRatio(true);
		shipView.setPreserveRatio(true);
		sunsetView.setPreserveRatio(true);

		// Place images in a vbox
		VBox vbox = new VBox(10, moonView, shipView, sunsetView);
		// Create some Padding
		vbox.setPadding(new Insets(30));

		//Set the scene
		Scene scene = new Scene(vbox);

		//Set the stage
		stage.setScene(scene);
		stage.setTitle("Vbox image demo");
		stage.show();
	}
	// Method main launches gui
	public static void main(String[] args) {
		launch(args);
	}
}

