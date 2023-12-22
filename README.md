Given the following BankAccount Class:

package Main;
import Exception.*;

class BankAccount {

private String name; // your name
private double balance; // current amount of money you save in the bank account
private final static double depositLimit = 500;
private final static double withdrawLimit = 500;

  	/** constructor */
public BankAccount(String name, double balance) {
this.name = name;
this.balance = balance;
}

/** constructor */
public BankAccount(String name) {
this(name,0);
}	

/** return balance */
public double getbalance() {
return balance;
}

/** return name */
public String getName() {
return name;
}

public String toString() {
return "Name: " + name + "\n" + "balance: " + balance ;
}

/** deposit money into the account */
public void deposit(double depositAmount) throws BankAccountException {
// TODO

}
/** withdraw money from the account */
public void withdraw(double withdrawAmount) throws BankAccountException {
// TODO
}
}


1.Create the following Exception classes:

BankAccountException
InvalidAmountException extends BankAccountException
NotEnoughBalanceException extends BankAccountException
WithdrawLimitException extends BankAccountException
DepositLimitException extends BankAccountException

2.Implement the deposit(double depositAmount) method which:

Throws InvalidAmountException if amount is non positive
Throws DepositLimitException if the amount is greater than the deposit limit
Otherwise, deposit the amount

3.Implement the withdraw(double withdrawAmount)method which:

Throws InvalidAmountException if amount is non positive
Throws WithdrawLimitException if the amount is greater than the withdraw limit
Throws NotEnoughBalanceException if the amount is greater than the current balance
Otherwise, withdraw the amount
