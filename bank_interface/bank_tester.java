package bank_interface;
import java.util.Scanner;

public class bank_tester {
	public static void main(String[] args) {
		//Getting User input 
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				System.out.println("Choose the bank name you want to open - BOB or HDFC");
				String bankName=sc.next();
				System.out.println("1) Create account");
				System.out.println("2) Withdraw amount");
				
				//To create an account in BOB or HDFC
				int option = sc.nextInt();
				if(option==1) {
					System.out.println("Enter your account number");
					int accNo = sc.nextInt();
					System.out.println("Enter your name");
					String custName = sc.next();
					System.out.println("Enter your intial balance");
					int initBalance = sc.nextInt();
					
					if(bankName.equals("BOB")) {
						BOB obj1=new BOB();
						obj1.creatAccount(accNo,custName,initBalance);
					}
					else if(bankName.equals("HDFC")) {
						HDFC obj2=new HDFC();
						obj2.creatAccount(accNo,custName,initBalance);
					}
					
				}
				//To withdraw amount from HDFC or BOB
				else if(option==2) {
					System.out.println("Enter your account number");
					int accNo = sc.nextInt();
					System.out.println("Enter withdrawal amount");
					double amount = sc.nextDouble();
					
					if(bankName.equals("BOB")) {
						BOB obj1=new BOB();
						obj1.withdraw(accNo,amount);
					}
					else if(bankName.equals("HDFC")) {
						HDFC obj2=new HDFC();
						obj2.withdraw(accNo,amount);
						obj2.payBills();
					}
					
				}
				
				
				
			}
		}
		
	}

}
