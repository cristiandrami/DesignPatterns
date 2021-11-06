import factoryMethod.Form;
import factoryMethod.FormsCreator;
import factoryMethod.SquareCreator;
import factoryMethod.TriangleCreator;

public class Main {
	public static void main(String[] args) {
		FormsCreator creator= new TriangleCreator();
		Form form= creator.createForm();
		form.drawForm();
		
		creator= new SquareCreator();
		form=creator.createForm();
		form.drawForm();
	}
}
