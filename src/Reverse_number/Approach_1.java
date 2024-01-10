package Reverse_number;

public class Approach_1 
{
	public static void main(String[] args) 
	{
		int orgNum=1234;
		
		int revNum=0;
		
		for (int i=orgNum; i>0; i=i/10 )			// 1234/10 = 123*10 = 1230
		{
			int rem= i%10;				//4		3	
			
			revNum = revNum*10 + rem;				
		}
		System.out.println(revNum);				
	}
}
