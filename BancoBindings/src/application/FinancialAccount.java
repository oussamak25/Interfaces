package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FinancialAccount {

		private final StringProperty accountHolder;
	    private final IntegerProperty accountNumber;
	    private final DoubleProperty accountBalance;

	    public FinancialAccount(String accountHolder, Integer accountNumber, Double accountBalance) {
	        this.accountHolder = new SimpleStringProperty(accountHolder);
	        this.accountNumber = new SimpleIntegerProperty(accountNumber);
	        this.accountBalance = new SimpleDoubleProperty(accountBalance);
	    }

	    public String getAccountHolder() {
	        return accountHolder.get();
	    }

	    public StringProperty accountHolderProperty() {
	        return accountHolder;
	    }

	    public int getAccountNumber() {
	        return accountNumber.get();
	    }

	    public IntegerProperty accountNumberProperty() {
	        return accountNumber;
	    }

	    public double getAccountBalance() {
	        return accountBalance.get();
	    }

	    public DoubleProperty accountBalanceProperty() {
	        return accountBalance;
	    }
	    
	    public void deposit(double amount){
	        accountBalance.set(accountBalance.get() + amount);
	    }

	    public void withdraw(double amount){
	        accountBalance.set(accountBalance.get() - amount);
	    }

}
