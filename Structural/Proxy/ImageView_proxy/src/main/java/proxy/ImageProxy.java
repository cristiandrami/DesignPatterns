package proxy;

public class ImageProxy implements Image {

	private ImageConcrete img=null;
	private String path="";
	public ImageProxy(String path) {
		this.path=path;
	}
	
	public javafx.scene.image.Image getImage() {
		if (img==null) {
			img= new ImageConcrete();
			img.loadImg(path);
			
		}
		return img.getImage();
	}

}
