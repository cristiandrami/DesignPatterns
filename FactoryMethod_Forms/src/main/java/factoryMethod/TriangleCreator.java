package factoryMethod;

public class TriangleCreator implements FormsCreator {

	public Form createForm() {
		return new Triangle();
	}

}
