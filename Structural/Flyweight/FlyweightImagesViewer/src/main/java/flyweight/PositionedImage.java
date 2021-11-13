package flyweight;

public class PositionedImage implements Image{

	private javafx.scene.image.Image internalImage;
	
	public PositionedImage(String path)
	{
		internalImage= new javafx.scene.image.Image(getClass().getResourceAsStream(path));
	}
	public javafx.scene.image.Image getImage() {
		return internalImage;
	}

}
 