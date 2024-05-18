package JavaProgramEx;

public class BankAccount {
	
	private String accnum;
	private double bal; 
	
	public BankAccount(String accnum, double initialbal)
	{
		this.accnum = accnum; 
		this.bal = initialbal;
	}
	
	public double getBalance()
	{
		return bal;
	}
	
	
	public void deposite(double amt)
	{
		if(amt  >  0)
		{
			bal = bal +amt;
		}
	}
	
	public void withdraw(double amt) throws InsufficientFundsException
	{
		if(amt > bal)
		{
			 throw new InsufficientFundsException("Insufficient funds. Your balance is " + bal + ", but you tried to withdraw " + amt);
		}
		bal -= amt;
	}
	
	public String getAccNum()
	{
		return accnum;
	}

	
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("123456789369", 500.00);
		 System.out.println("Initial balance: " + acc.getBalance());
		 
		 acc.deposite(1000);
		 System.out.println("Balance after deposit: " + acc.getBalance());
		 try {
	            acc.withdraw(2000);
	            System.out.println("Balance after withdrawal: " + acc.getBalance());
	        } catch (InsufficientFundsException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
