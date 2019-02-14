package encapsulation.bank.accountdetails;

public class BankaccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccountDetails ad = new AccountDetails();
		System.out.println("The customer details are");
		System.out.println("Customer name:" + ad.getCustomerName());
		System.out.println("Account number:" +ad.getAccountNumber());
		if(ad.getOption() == 0) {
			System.out.println("The Money is deposited to the account and balance is :" +ad.getCurrentBalance());
		}
		else {
			System.out.println("The Money is with drawn and current balance is: " +ad.getCurrentBalance());
		}
		
		
	}

}
