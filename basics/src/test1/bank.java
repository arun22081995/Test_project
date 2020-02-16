package test1;

public class bank {

	
	public static void main(String[] args)
	{
		
		int pin=1111;
		
		if(pin ==1111)
		{
			double accbal =5000.0;
			double amt=2000.00;
			
			if(amt <  accbal && amt > 0)
			{
				System.out.println("withdraw amount"+amt);//5000
				
				accbal = accbal - amt;
				System.out.println("account balance"+accbal);//3000
			}
			
			else 
			{
				System.out.println("insufficient balance.....");
				
			}
		}
		else
		{
			System.out.println("invalid pin....");
			
		}
	}
}
