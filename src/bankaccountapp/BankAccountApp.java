package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\FISH\\Documents\\Projects_myself\\JavaProjects\\src\\NewBankAccounts.csv";
		
		/*
		Checking chkacc1 = new Checking("Tom", "123456789", 1500);
		
		Saving savacc1 = new Saving("Jone", "234567890", 2500);
		
		chkacc1.showInfo();
		
		System.out.println("***************");
		
		savacc1.showInfo();
		
		savacc1.compound();
		*/
		
		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for (String[] accountHolder : newAccountHolders)
		{
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			
			if (accountType.equals("Savings"))
			{
				// System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Saving(name, sSN, initDeposit));
			} 
			else if (accountType.equals("Checking"))
			{
				// System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}	
			else
			{
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts)
		{
			System.out.println("\n**********************");
			acc.showInfo();
		}
		
	}

}
