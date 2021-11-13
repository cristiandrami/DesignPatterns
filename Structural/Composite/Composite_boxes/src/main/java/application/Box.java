package application;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

	private List<Component> list = new ArrayList<Component>();
	
	public void showComponent() {
		System.out.println("I'm a box");
		for(Component elem: list)
		{
			elem.showComponent();
		}
		
	}

	public void addComponent(Component c) {
		list.add(c);
		
	}

	public void removeComponent(Component c) {
		list.remove(c);
		
	}

	public void getChildren(Integer idx) {
		list.get(idx);
		
	}

}
