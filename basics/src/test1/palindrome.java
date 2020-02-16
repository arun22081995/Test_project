package test1;

public class palindrome {
	
	public static void main(String[] args)
	{
	int num=151;
	int sum=0,temp;
	temp=sum;
	while(num>0)
	{
		int rem =num %10;
		sum = sum *10+rem;
		num = num /10;
	}
	
	if(temp == num)
	{
		System.out.println("the given number is  palindrome number"+sum);
		
		   
	}
	else
	{
		System.out.println("the given number is not a palindrome number is"+sum);
	}
	
	}
}
