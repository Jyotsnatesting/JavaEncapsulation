package encapsulation.bank.accountdetails;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountDetails {

	private int AccountNumber;
	private String CustomerName;
	private int CurrentBalance;
	private String email;
	private int phonenumber;
	private int Amount;
	private int Option;
	
	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		if(getOption() ==1) {
		Amount = amount;
		if(Amount>CurrentBalance) {
		while (Amount>CurrentBalance) {
			
			System.out.println("Balance is not sufficient to with draw.");
			System.out.println("Please enter the amount less than current balance: " +CurrentBalance );
			System.out.println("Enter 0 to quit");
			setAmount(user_input.nextInt());
			if(Amount == 0) {
				System.out.println("We are exiting the application, as per user input");
				System.exit(0);
			}
				}
		
		}
		else {
			int balance = getCurrentBalance()-Amount;
			setCurrentBalance(balance); 
					}
		}
		else {
			Amount = amount;
			System.out.println("We are depositing the money to account." +Amount);
			CurrentBalance = getCurrentBalance() + Amount;
			setCurrentBalance(CurrentBalance);			
			
		}
	
	}
	Scanner user_input = new Scanner(System.in);
			
	public int getOption() {
		return Option;
	}

	public void setOption(int option) {
		Option = option;
		System.out.println("Option is " +getOption());
			while(Option != 0 && Option != 1) {
				
				System.out.println("Please enter the valid option 0 or 1:");
				System.out.println("\t 0: Deposit");
				System.out.println("\t 1: WithDrawl");
				setOption(user_input.nextInt());;
				
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
		int temp = phonenumber;
		int count = 0;
		while(temp != 0) {
			
			temp = temp/10;
			count ++;
			
		}
		if(count >10 || count < 10) {
			System.out.println("Please Enter a valid PHONE NUMBER: It should be 10 didgits or enter :0 to quit");
			this.phonenumber = user_input.nextInt();
			if(this.phonenumber == 0) {
				System.out.println("Not a valid Account number and we are exiting the application");
				System.exit(1);
			}
			setPhonenumber(this.phonenumber);
			
		}
	}
}
