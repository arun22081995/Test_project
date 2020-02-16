package test1;

public class ternary1 {
	public static void main(String[] args)
	{
	int a=10;
	int b= 60;
	int c=50;
	int ter;
	int result;
	ter = a> b ? a:b;
	result = c > ter ? c : ter;
	System.out.println("enter the largest number"+result);
	}
}
