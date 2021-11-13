package controller;
import flyweight.ImageFactory;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class HomepageController {
	
	ImageFactory imagesFactory;

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
    			Image image= imagesFactory.getImage(path).getImage();
    			ImageView imageAdd= new ImageView(image);
    			viewerBox.getChildren().add(imageAdd);

    			

    		}
    	});
    }
    		
    	
@FXML 
public void initialize()
{
	imagesFactory= new ImageFactory();
	//chooseBox= new VBox();
	//viewerBox= new VBox();
	
	
	for(Integer i=0; i<3; i++)
	{
		Label label = new Label("/images/img" + i.toString()+".jpg");
		label.setText("/images/img" + i.toString()+".jpg");
		addListener(label);
		chooseBox.getChildren().add(label);
		System.out.println("ciao");
		
	}
	
}
  

}
