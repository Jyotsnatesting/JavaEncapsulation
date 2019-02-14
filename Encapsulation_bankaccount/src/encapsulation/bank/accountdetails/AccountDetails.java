package encapsulation.bank.accountdetails;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountDetails {

	private int AccountNumber;
	private String CustomerName;
	private int CurrentBalance;
	private int WithdrawlAmount;
	private int DepositAmount;
	private int Option;
	
	Scanner user_input = new Scanner(System.in);
			
	public int getOption() {
		return Option;
	}

	public void setOption(int option) {
		Option = option;
	}

	public AccountDetails() {
		
		try {
			System.out.println("Enter the Account Details:");
			System.out.println("Enter the Account Number: ");
			AccountNumber = user_input.nextInt();
			setAccountNumber(AccountNumber);
			System.out.println("Enter the CustomerName :");
			CustomerName = user_input.next();
			System.out.println("Enter the Current Balance :");
			CurrentBalance = user_input.nextInt();
			System.out.println("Enter the Option: ");
			System.out.println("\t 0: Deposit");
			System.out.println("\t 1: WithDrawl");
			Option = user_input.nextInt();
			while(Option == 0 && Option == 1) {
				
				System.out.println("Please enter the valid option 0 or 1:");
				System.out.println("\t 0: Deposit");
				System.out.println("\t 1: WithDrawl");
				Option = user_input.nextInt();
				
			}
			switch(Option) {
			
			case 0: System.out.println("Please enter Deposit Amount");
					DepositAmount = user_input.nextInt();
					System.out.println("We are depositing the money to account." +DepositAmount);
					CurrentBalance = CurrentBalance + DepositAmount;
					setCurrentBalance(CurrentBalance);
					break;
			case 1: System.out.println("Please enter Withdrawl Amount");
					WithdrawlAmount = user_input.nextInt();
					setWithdrawlAmount(WithdrawlAmount);
					break;
				
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("The input type is mismatch");
		}
		
		
	}
	
	

	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
		int temp = AccountNumber;
		int count = 0;
		while(temp != 0) {
			
			temp = temp/10;
			count ++;
			
		}
		if(count>3) {
			System.out.println("Please Enter a valid account number: It should be 3 didgits or enter :0 to quit");
			AccountNumber = user_input.nextInt();
			if(AccountNumber == 0) {
				System.out.println("Not a valid Account number and we are exiting the application");
				System.exit(1);
			}
			setAccountNumber(AccountNumber);
			
		}
		
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCurrentBalance() {
		return CurrentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		CurrentBalance = currentBalance;
	}
	public int getWithdrawlAmount() {
		return WithdrawlAmount;
	}
	public void setWithdrawlAmount(int withdrawlAmount) {
		WithdrawlAmount = withdrawlAmount;
		if(WithdrawlAmount>CurrentBalance) {
		while (WithdrawlAmount>CurrentBalance) {
			
			System.out.println("Balance is not sufficient to with draw.");
			System.out.println("Please enter the amount less than current balance: " +CurrentBalance );
			System.out.println("Enter 0 to quit");
			WithdrawlAmount = user_input.nextInt();
			setWithdrawlAmount(WithdrawlAmount);
			if(WithdrawlAmount == 0) {
				System.out.println("We are exiting the application, as per user input");
				System.exit(0);
			}
		}
		
		}
		else {
			int balance = getCurrentBalance()-WithdrawlAmount;
			setCurrentBalance(balance); 
			//System.out.println("The Amount is WITHDRAWN and the current balance is : " +getCurrentBalance());
		}
	}
	public int getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		DepositAmount = depositAmount;
	}
	
	
	
	
}
