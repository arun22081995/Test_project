package test1;

public class prime {
	
	public static void main(String[] args)
	{
	int num=7;
	boolean res=true;
	for(int i=2;i<=num/2;i++)//to reduce code optimzation
		//it means the loop will can runs upto the given number and by divide by 2 it can reduce the code iteration optimazation.
	{
		if(num % i==0)
		{
			res = false;
			break;
		}
		if(res)
		{
			System.out.println("the given number is a prime number "+num);
		}
		
		else 
		{
			System.out.println("the given number is not a prime number "+num);
		}
	}
	}
}
