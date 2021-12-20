package bank_interface;

public class HDFC implements Bank{

	@Override
	public boolean creatAccount(int accNo, String custName, double initBalance) {
		// TODO Auto-generated method stub
		if(initBalance>5000) {
			System.out.println("You account in HDFC has been created successfully, "+custName+" and account number "+accNo);
			
			return true;
	}
		else 
		{
			System.out.println("Minimum balance is 5000");
			return false;
		}
		
	}

	@Override
	public void withdraw(int accNo, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal from account number, "+accNo+" is successful");
	}
	//Special method in child
	public void payBills() {
		System.out.println("Your payment through HDFC account is successful");
	}
	

}
