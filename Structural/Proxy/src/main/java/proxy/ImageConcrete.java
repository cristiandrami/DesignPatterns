package proxy;

public class ImageConcrete implements Image{

	private javafx.scene.image.Image internalImage;
	
	public ImageConcrete(){
	}
	
	public javafx.scene.image.Image getImage() {
		return internalImage;
	}
	public void loadImg(String path) {
		internalImage= new javafx.scene.image.Image(getClass().getResourceAsStream(path),500,500,false,false);
		
	}

}
 