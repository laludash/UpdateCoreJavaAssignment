package JavaProgramEx;

public class Account {

	private double bal;
	
	public Account(double initialBal)
	{
		this.bal  = initialBal;
	}
	  public void displayBalance() {
	        System.out.println("Current balance: $" + bal);
	    }
	  
	  public void deposite(double amt)
	  {
		  if(amt > 0)
		  {
			  bal += amt;
		  }
		  
	  }
	  public void withdraw(double amt)
	  {
		  if(amt >0 && amt<= bal)
		  {
			  bal -=amt;
		  }
	  }

	  
	
}
