package controller;

import java.io.IOException;
import java.io.InputStream;

import application.SceneHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import model.ColoredDrawer;
import model.DrawerFactory;
import model.UncoloredDrawer;

public class DrawerPageController {

	static DrawerFactory drawer=null;

    @FXML
    private Button circleButton;

    @FXML
    private Button triangleButton;

    @FXML
    private Button squareButton;
    @FXML
    private ImageView image;
    
    @FXML
    private BorderPane centerBordePane= new BorderPane();

    @FXML
    void triangleButtonPressed(ActionEvent event) {
    	if(drawer instanceof ColoredDrawer)
       	   centerBordePane.setStyle("-fx-background-color: #facc4c;");
    	
    	image.imageProperty().set(new Image(drawer.trianglePath()));
    	
    	
  
    }

    @FXML
    void squareButtonPressed(ActionEvent event) {
    	if(drawer instanceof ColoredDrawer)
        	   centerBordePane.setStyle("-fx-background-color: #facc4c;");
    	
    	image.imageProperty().set(new Image(drawer.squarePath()));

    }

    @FXML
    void circleButtonPressed(ActionEvent event) {
    	if(drawer instanceof ColoredDrawer)
        	   centerBordePane.setStyle("-fx-background-color: #facc4c;");
    	image.imageProperty().set(new Image(drawer.circlePath()));
    }
    
    static void setDrawer(DrawerFactory d) {
    	drawer= d;
    	
    }
    
    
    

}
