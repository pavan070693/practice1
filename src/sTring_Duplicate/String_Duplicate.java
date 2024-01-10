package sTring_Duplicate;

public class String_Duplicate {

	public static void main(String[] args) 
	{
			String name="PAVAN";
			
			StringBuilder s1=new StringBuilder();
			
			for(int i=0; i<name.length(); i++)
			{

				int index = name.indexOf(name.charAt(i), i+1);
				
				if(index==-1)
				{
					s1.append(name.charAt(i));
				}
			}
			
			System.out.println(s1);
	}

}
