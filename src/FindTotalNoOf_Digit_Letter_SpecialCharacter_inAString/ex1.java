package FindTotalNoOf_Digit_Letter_SpecialCharacter_inAString;

public class ex1 
{
	public static void main(String[] args) 
	{
		String str = "abc 12 @";
		
		int countDigit=0;
		int countLetter=0;
		int countSpecialCharacter=0;
		int countWhiteSpaces=0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
			if(Character.isAlphabetic(s1))
			{
				countLetter++;
			}
			
			else if(Character.isDigit(s1))
			{
				countDigit++;
			}
			
			else if(Character.isWhitespace(s1))
			{
				countWhiteSpaces++;
			}
			
			else
			{
				countSpecialCharacter++;
			}
		}
		
		System.out.println("No of Digit = "+countDigit);
		System.out.println("No of Letter = "+countLetter);
		System.out.println("No of white spaces = "+countWhiteSpaces);
		System.out.println("No of Special character = "+countSpecialCharacter);
	}
}
