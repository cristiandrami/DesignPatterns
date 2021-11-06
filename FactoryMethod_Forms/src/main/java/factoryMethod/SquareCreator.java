package factoryMethod;

public class SquareCreator implements FormsCreator{

	public Form createForm() {
		return new Square();
	}

}
