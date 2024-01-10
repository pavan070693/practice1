package swaping2numbers;

public class approach_2 {

	public static void main(String[] args) {
				
				int a=10 , b=20 ;
				
				// System.out.println("Before swapping= "+a+" , "+b);
				
				//using + & -
		
				a = a+b;		//30		//a=10+20=30
				b = a-b;		//10		//b=30-20=10
				a = a-b;		//20		//a=30-10=20
				
				System.out.println("After swapping = "+a+" , "+b);
				
	}
}
