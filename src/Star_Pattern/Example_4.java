package Star_Pattern;

public class Example_4 {

	public static void main(String[] args) 
	{
		//  *
		// **
		//***
		
		int space=2;
		int star=1;
		
		for(int i=1; i<=3; i++)			//outer loop = no of Rows
		{
			for(int j=1; j<=space; j++)		//first inner loop for spaces (as they come first)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++)		//second inner loop for star (as they come after space)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}

}
