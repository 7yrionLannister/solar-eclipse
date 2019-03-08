package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("EclipseTotal.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Eclipse total");
		stage.show();
	}
}
