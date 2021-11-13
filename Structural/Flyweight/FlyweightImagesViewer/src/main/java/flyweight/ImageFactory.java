package flyweight;

import java.util.HashMap;

public class ImageFactory {
	
	private HashMap<String, Image> images= new HashMap<String, Image>();
	
	
	public Image getImage(String path)
	{
		if(!images.containsKey(path))
		{
			images.put(path, new PositionedImage(path));
		}
		return images.get(path);
			
		
	}

}
