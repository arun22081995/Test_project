package test1;

public class fibonacci {
	
	public static void main(String[] args)
	{
	
		int n=15,a=0,b=1;
		int i=1;
		while(i<n-1)//this line is used to stop the range of iteration
		{
			int sum = a+b;
			a = b ;
			b = sum;
			System.out.println("the given fibonacci number is"+sum);
			i++;//incrementing the values.
		}

}
}
