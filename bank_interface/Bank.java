package bank_interface;

//creating a bank interface with methods that child can override
public interface Bank {
	boolean creatAccount(int accNo, String custName, double initBalance);
	void withdraw(int accNo,double amount);
}
