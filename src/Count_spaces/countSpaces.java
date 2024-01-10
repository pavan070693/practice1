package Count_spaces;

public class countSpaces {

	public static void main(String[] args) 
	{
		String s1= "Pa v a n";
		
		int space = 0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char character = s1.charAt(i);
			
			if (character == ' ')
			{
				space++;
			}
		}
		
		System.out.println("Total no of spaces= "+ space);
	}
}
