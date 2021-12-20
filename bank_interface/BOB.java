package bank_interface;

public class BOB implements Bank{

	//@Override
	public boolean creatAccount(int accNo, String custName, double initBalance) {
		
		// TODO Auto-generated method stub
		
		if(initBalance>1000) {
			System.out.println("You account has been created successfully, "+custName+" account number "+accNo);
			
			return true;
	}
		else 
		{
			System.out.println("Minimum balance is 1000");
			return false;
		}
	}

	@Override
	public void withdraw(int accNo, double amount) {
		// TODO Auto-generated method stub
		System.out.println("withdrawal from the account number,  "+accNo+"  successful");
	}
	

	
}
