package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneHandler 
{
	private Scene scene;
    private Stage stage;
	
	private static SceneHandler instance = null;
	
	private SceneHandler() {}
	
	public void init(Stage primaryStage) throws Exception 
	{		
		stage = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/homePage.fxml"));
    	Parent root = (Parent) loader.load();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setMinHeight(450);
		stage.setMinWidth(700);
		stage.setTitle("Forms Drawer");
		scene.getStylesheets().clear();
		scene.getStylesheets().add(getClass().getResource("/css/commonFont.css").toExternalForm());
		stage.setResizable(false);
		stage.show();
	}
	
	public static SceneHandler getInstance() 
	{
		if(instance == null)
			instance = new SceneHandler();
		return instance;
	}   
	
	public void switchToDrawerPage()  throws IOException
	{
		 
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/drawerPage.fxml"));

    	Parent root = (Parent) loader.load();    	
		scene.setRoot(root);
		stage.setHeight(760);
		stage.setWidth(1050);
		stage.setTitle("Colored Drawer");
		stage.setResizable(true);
		stage.show();

		
	}

	public void switchToNotColoredPage() throws IOException
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/notColoredPage.fxml"));

    	Parent root = (Parent) loader.load();    	
		scene.setRoot(root);
		stage.setHeight(760);
		stage.setWidth(1050);
		stage.setTitle("Uncolored Drawer");
		stage.setResizable(true);
		stage.show();
		
	}

	public void showFrom() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/drawerPage.fxml"));

    	Parent root = (Parent) loader.load();    	
		scene.setRoot(root);
		stage.setHeight(760);
		stage.setWidth(1050);
		stage.setTitle("Choosed form");
		stage.setResizable(true);
		stage.show();
		
	}
}