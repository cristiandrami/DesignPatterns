package factoryMethod;

public class Triangle implements Form{

	public void drawForm() {
		for( int i=1; i<5; i++)
		{
			for(int j=0; j<i; j++)
				System.out.print("*");
			
			System.out.println();
			
		}
		
	}

}
