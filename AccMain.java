package JavaProgramEx;

public class AccMain {

	public static void main(String[] args) {
		
		  Account myAccount = new Account(500.00);
		  myAccount.displayBalance();
		  myAccount.deposite(150.00);
	        myAccount.displayBalance();
	        myAccount.withdraw(200.00);
	        myAccount.displayBalance();
	}

}
