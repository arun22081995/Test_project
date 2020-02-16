package test1;

public class reverse {
	
	public static void main(String[] args)
	{
	
		int num =654;//this is number we are defining
		int rem =0; // this is remainder first we will get 4 for first iteration
		int rev =0; // this is for reverse an number to store the values in temp variables
		
		while (num>0)//this is iteration while each iteration it will take each rem values and store it in 
			//rev variable that means temp variables we are giving to store the remainder
		{
			rem = num % 10; // this is rem value to get first 4 5 6
			rev = rev * 10 +rem ; 
			//this rev only store the values of rem for eg 4 it will and sent to number 
			//so remaining number will have 65 will there then again it will goes next iteration will same process from 
			//first step 
			num = num /10;
			
		}
		System.out.println("the reverse number is "+rev);
		//finally it will take all iteration and print the temp varible na 
		//temporary variables to get the values 

}
}
