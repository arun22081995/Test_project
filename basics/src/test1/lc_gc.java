package test1;

public class lc_gc {
	
	static int x=10;  //outside the function
	
	   //x=20;
	
	
	public static void main(String[] args)
	{
		
		
		System.out.println("local variables value"+x);
		int x=100;//inside the function
		System.out.println("local variables x value"+x);//local variables
		System.out.println("global variables x value"+lc_gc.x);
		//global variables
		

}
	
	
}
