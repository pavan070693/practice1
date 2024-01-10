package String_Palindrome;

public class ex1 {

	public static void main(String[] args) 
	{
		String s1="Pavan";
		String s2="";
		
		for(int i=s1.length()-1 ; i>=0 ; i--)
		{
			s2 = s2 + s1.charAt(i);				
		}
		System.out.println(s2);				//n a v a p
		
		
		if(s1.equals(s2))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is Not Palindrome");
		}
	}
}
