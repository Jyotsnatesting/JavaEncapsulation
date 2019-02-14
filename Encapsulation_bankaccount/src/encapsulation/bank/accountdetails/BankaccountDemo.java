package encapsulation.bank.accountdetails;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankaccountDemo {

	private static Scanner user_input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		user_input = new Scanner(System.in);
		AccountDetails ad = new AccountDetails();
		System.out.println("================================================");
		System.out.println("	       Enter CUSTOMER Details:");
		System.out.println("================================================");
		System.out.println("  1. Account Number: ");
		ad.setAccountNumber(user_input.nextInt());
		System.out.println("  2. CustomerName :");
		ad.setCustomerName(user_input.next());
		System.out.println("  3. Phone Number:");
		ad.setPhonenumber(user_input.nextInt());
		System.out.println("  4. EmailID: ");
		ad.setEmail(user_input.next());
		System.out.println("  5. Current Balance :");
		ad.setCurrentBalance(user_input.nextInt());
		System.out.println("Enter the Option: ");
		System.out.println("\t 0: Deposit");
		System.out.println("\t 1: WithDrawl");
		ad.setOption(user_input.nextInt());
		if(ad.getOption() == 0) {
			System.out.println("Enter the Amount to be deposited");
		}
		else {
			System.out.println("Enter the Amount for WithDrawl");
		}
		ad.setAmount(user_input.nextInt());
		System.out.println("===============================================");
		System.out.println("              CUSTOMER DETAILS        ");
		System.out.println("===============================================");
		System.out.println("Customer Name:" + ad.getCustomerName());
		System.out.println("Account Number:" +ad.getAccountNumber());
		System.out.println("Phone Number:" +ad.getPhonenumber());
		System.out.println("Email ID:" +ad.getEmail() );
		if(ad.getOption() == 0) {
			System.out.println("Deposit completed and CURRENT BALANCE:" +ad.getCurrentBalance());
		}
		else {
			System.out.println("WithDrawl Completed and CURRENT BALANCE: " +ad.getCurrentBalance());
			System.out.println("===============================================");
		}
		}
		catch(InputMismatchException e) {
			
			System.out.println("Details entered are not correct..so exiting the application");
			System.out.println("===============================================");
		}
		
	}
	

}
