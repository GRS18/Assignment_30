package Assignment_30;
import java.util.Scanner;
public class SavingsAccounts {
	
	    private double savingBalance;
	    private static double annualInterestRate;
	    private double intAmount;

	    public double getSavingBalance() {
	        return savingBalance;
	    }

	    public void setSavingBalance(double savingBalance) {
	        this.savingBalance = savingBalance;
	    }

	    public static void modifyInterestRate(double newInterestRate) {
	        annualInterestRate = newInterestRate;
	    }

	    public void calculateMonthlyInterest() {
	        intAmount = (savingBalance * (annualInterestRate/100)) / 12;
	        savingBalance += intAmount;
	        System.out.println("Monthly interest: " + intAmount);
	        System.out.println("New balance after adding interest: " + savingBalance);
	    }

	    public static void main(String[] args) {
	    	SavingsAccounts savingsAccounts = new SavingsAccounts();
	    	SavingsAccounts savingsAccounts1 = new SavingsAccounts();
	        savingsAccounts.setSavingBalance(10000.00);
	        savingsAccounts1.setSavingBalance(50000.00);

	        savingsAccounts.modifyInterestRate(3);

	        System.out.println("intereset when is 3");
	       savingsAccounts.calculateMonthlyInterest();
	        System.out.println("\nintereset when is 3");
	       savingsAccounts1.calculateMonthlyInterest();
	        System.out.println("=====================================================");
	        savingsAccounts.modifyInterestRate(4);
	        System.out.println(" After modifying ");
	        savingsAccounts.calculateMonthlyInterest();
	       savingsAccounts1.calculateMonthlyInterest();
	    }
	}
//@GRS