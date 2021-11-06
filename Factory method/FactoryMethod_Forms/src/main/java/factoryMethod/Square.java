package factoryMethod;

public class Square implements Form {

	public void drawForm() {
		for( int i= 0; i<5; i++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		for( int i= 0; i<3; i++)
		{
			System.out.print("*");
			for(int j=1; j<4; j++)
			{
				System.out.print("  ");
			}
			System.out.println(" *");
				
		}
		for( int i= 0; i<5; i++)
		{
			System.out.print("* ");
			
		}

	}

}
