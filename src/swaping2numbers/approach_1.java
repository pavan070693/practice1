package swaping2numbers;

public class approach_1 {

	public static void main(String[] args) 
	{
		//using 3rd variable
		
		int a=10, b=20;
		
		int c;		//a=20,b=10		//c		//c=a 	//a=b	//b=c
		
		// System.out.println("Before swapping= "+a+" , "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("result= "+a+" , "+b);
		System.out.println("After swapping case 1 = "+a+" , "+b);
	}
}
