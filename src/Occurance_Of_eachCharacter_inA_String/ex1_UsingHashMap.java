package Occurance_Of_eachCharacter_inA_String;

import java.util.HashMap;
import java.util.Set;

public class ex1_UsingHashMap 
{
	public static void main(String[] args) 
	{
		String str = "abcaba";
		
		HashMap<Character, Integer> hm = new HashMap();
		
		for (int i=0 ; i<=str.length()-1 ; i++)
		{
			char s1 = str.charAt(i);
			
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
			{
				hm.put(s1, 1);
			}
		}
		
		Set<Character> allKeys = hm.keySet();
		
		for(Character keys : allKeys)
		{
			System.out.println(keys+"-"+hm.get(keys));
		}
		
		System.out.println("Print Only duplicate");
		
		for(Character key:allKeys)
		{
			if(hm.get(key)>1)
			{
				System.out.println(key+"-"+hm.get(key));
			}
		}
	}
}
