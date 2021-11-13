package controller;
import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import proxy.Image;
import proxy.ImageProxy;

public class HomepageController {
	
	HashMap<String, Image> imagesProxy= new HashMap<String, Image>();

    @FXML
    private VBox chooseBox;

    @FXML
    private VBox viewerBox;
    
    public HomepageController()
    {
    	
    	
    	
    }
    
    

    private void addListener( final Label l)
    {
    	l.setOnMouseClicked(new EventHandler<MouseEvent>() {

    		public void handle(MouseEvent event) {
    			String path=l.getText();
    			
    			//qui creo img giusto per rendere più leggibile il codice
    			Image img= imagesProxy.get(path);
    			//ora richiamo la funzione della image proxy che:
    			//se l'immagine interna esiste o è già stata caricata allora la ritorna
    			// altrimenti me la carica e poi me la ritorna
    			javafx.scene.image.Image image= img.getImage();
    			
    			
    			ImageView imageAdd= new ImageView(image);
    			viewerBox.getChildren().add(imageAdd);
    			
    			
    			Alert added= new Alert(AlertType.INFORMATION);
    			added.setTitle("image added");
    			added.setHeaderText("Image has been added");
    			added.show();
    			
    			

    		}
    	});
    }
    		
    	
@FXML 
public void initialize()
{
	chooseBox.setSpacing(10);
	
	//chooseBox= new VBox();
	//viewerBox= new VBox();
	
	
	for(Integer i=0; i<3; i++)
	{
		Label label = new Label("/images/img" + i.toString()+".jpg");
		label.setText("/images/img" + i.toString()+".jpg");
		addListener(label);
		label.setStyle( "-fx-background-color: #0000ff;");
		chooseBox.getChildren().add(label);
		
		//qui invece di salvarmi subito le immagini che devo mostrare mi salvo le Proxy
		Image img=new ImageProxy("/images/img" + i.toString()+".jpg");
		
		imagesProxy.put("/images/img" + i.toString()+".jpg", img);
		
	}
	
}
  

}
