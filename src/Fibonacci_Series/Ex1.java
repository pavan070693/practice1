package Fibonacci_Series;

public class Ex1 
{
	static void fibbo(int n)
	{
		int t1=0, t2=1, extraT;
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(t1 + " ");
			
			extraT = t1+t2;
			t1 = t2;
			t2=extraT;
		}
	}
	
	public static void main(String[] args) 
	{
		int n = 10;
		fibbo(n);
	}
}
