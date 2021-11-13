package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/homePage.fxml"));
    	Parent root = (Parent) loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setMinHeight(450);
		stage.setMinWidth(700);
		stage.setTitle("Images Viewer");
		scene.getStylesheets().clear();
	
		//stage.setResizable(false);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
