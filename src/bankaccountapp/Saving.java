package bankaccountapp;

public class Saving extends Account {
	// List properties specific to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositKey;
	
	// Constructor to initialize settings for the savings properties
	public Saving (String name, String sSN, double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate()
	{
		rate = getBaseRate() - .25;
	}
	
	// List any methods specific to savings account
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3)); 
		safetyDepositKey = (int) (Math.random() * Math.pow(10,  4));
	}
	
	public void showInfo()
	{   
		super.showInfo();
		System.out.println(
				" Your Savings Account features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositKey
				);
	}
	
}