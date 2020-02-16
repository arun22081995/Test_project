package test1;

public class ternary {
	
	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	int c=50;
	int ter;
	int result;
	ter = a > b ? a:b;
	result = c > ter ? c : ter;
	System.out.println("enter the largest number"+result);
	
	}
}
	
	//String value=null;
	//if(object ! = null)
	//{
		//value = object.getvalue();
	//}

	//String value = object  ! = null ? object .getvalue() : null ;
	//instead of using switch statement 
	//we can use ternary operator

