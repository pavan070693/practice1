package removeSpacesFromString;

public class ex1 {

	public static void main(String[] args) 
	{
		String str = "a b  c   d";
		
		str = str.replace(" ", "");
		
		System.out.println(str);
	}
}
