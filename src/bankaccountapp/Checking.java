package bankaccountapp;

public class Checking extends Account {
	// List properties specific to the checking account
	private String debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate()
	{
		rate = getBaseRate() * .25;
	}
	// List any methods specific to the checking account
	private void setDebitCard()
	{
		int debitCardNumber1 = (int) (Math.random() * Math.pow(10, 4));
		int debitCardNumber2 = (int) (Math.random() * Math.pow(10, 4));
		int debitCardNumber3 = (int) (Math.random() * Math.pow(10, 4));
		debitCardNumber = debitCardNumber1 + " " + debitCardNumber2 + " " + debitCardNumber3;
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Debit Card PIN: " + debitCardPIN
				);
	}
}
