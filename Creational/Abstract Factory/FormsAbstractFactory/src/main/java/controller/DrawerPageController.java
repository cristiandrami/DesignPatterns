package controller;

import java.io.IOException;
import java.io.InputStream;

import application.SceneHandler;
import factory.ColoredDrawer;
import factory.DashedDrawer;
import factory.DrawerFactory;
import factory.UncoloredDrawer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import product.Circle;
import product.Square;
import product.Triangle;

public class DrawerPageController {

	static DrawerFactory drawer=null;
	
	private static Triangle triangle= null;
	private static Square square=null;
	private static  Circle circle= null;
	

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
    	
    	if(drawer instanceof UncoloredDrawer)
        	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
    	if(drawer instanceof DashedDrawer)
       	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
     	
    	
    	
    	image.imageProperty().set(new Image(triangle.getTriangle()));
    	
    	
  
    }

    @FXML
    void squareButtonPressed(ActionEvent event) {
    	
    	if(drawer instanceof ColoredDrawer)
        	   centerBordePane.setStyle("-fx-background-color: #facc4c;");
    	
    	if(drawer instanceof UncoloredDrawer)
     	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
    	
    	if(drawer instanceof DashedDrawer)
      	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
    	
    	image.imageProperty().set(new Image(square.getSquare()));

    }

    @FXML
    void circleButtonPressed(ActionEvent event) {
    	if(drawer instanceof ColoredDrawer)
        	   centerBordePane.setStyle("-fx-background-color: #facc4c;");
    	
    	if(drawer instanceof UncoloredDrawer)
     	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
    	
    	if(drawer instanceof DashedDrawer)
       	   centerBordePane.setStyle("-fx-background-color: #ffffff;");
    	
    	image.imageProperty().set(new Image(circle.getCircle()));
    }
    
    static void setDrawer(DrawerFactory d) {
    	drawer= d;
    	square= d.getSquare();
    	triangle=d.getTriangle();
    	circle=d.getCircle();
    	
    }
    
    
    

}
