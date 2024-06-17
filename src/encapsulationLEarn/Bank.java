package encapsulationLEarn;

public class Bank {

	
	private int balance=1000;
	
	
	public void withdraw(int wd)
	{
		if(wd<=balance)
		{
			balance=balance-wd;
			System.out.println(wd+" please collect your cash");
			System.out.println("Remaining balance is "+ balance);
		}
		else
		{
			System.out.println("you have insufficent balance");
		}
	}
	
	public void balEnquiry()
	{
		System.out.println("your balance is "+ balance);
	}
	
	public void deposit(int wd)
	{
		balance=wd+balance;
		System.out.println(wd + " your amount deposited");
		System.out.println("final balance is "+ balance);
		
	}
	
	
	

}
