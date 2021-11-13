package application;

public class Book implements Component {

	public void showComponent() {
		System.out.println("I'm a book");
		
	}
	public void addComponent(Component c) {
		System.out.println("you cannot add a child for this component");
		
	}

	public void removeComponent(Component c) {
		System.out.println("you cannot remove a child from this component");
		
	}

	public void getChildren(Integer idx) {
		System.out.println("you cannot get a child for this component");
		
	}
}
