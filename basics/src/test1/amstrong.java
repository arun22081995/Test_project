package test1;

public class amstrong {
	
	public static void main(String[] args)
	{
	int num=170;
	int cube=0;
	int temp;
	int a;
	temp=num;
    while (num > 0)
    {
    	a = num % 10;
    	
    	num = num /10;
    	
    	cube = cube +(a*a*a);
    	
    }
    
    if(temp==cube)
    {
    	System.out.println("the given amstrong number is"+cube);
    }
    else
    {
    	System.out.println("the given number is not a amstrong number is"+cube);	
    }
	}
	
}
