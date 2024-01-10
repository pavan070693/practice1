package Remove_duplicate_character;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex1 
{
	public static void main(String[] args) 
	{
		String str = "pavan waghurde";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(Character c: set)
		{
			sb.append(c);
		}
		
		System.out.println("String text after removing the duplicate charaacters is: "+sb);
	}
}
