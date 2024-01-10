package swaping2numbers;

public class approach_3 {

	public static void main(String[] args) 
	{
		int a=10 , b=20;
		
		System.out.println("Before swapping= "+a+" , "+b);
		
		//using * & /
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("After swapping = "+a+" , "+b);

	}

}
