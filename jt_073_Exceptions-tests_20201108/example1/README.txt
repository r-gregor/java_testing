from: https://www.tutorialspoint.com/java/java_exceptions.htm

...
User-defined Exceptions

You can create your own exceptions in Java. Keep the following points in mind when writing your own
exception classes:
- All exceptions must be a child of Throwable.
- If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule,
  you need to extend the Exception class.
- If you want to write a runtime exception, you need to extend the RuntimeException class.

We can define our own Exception class as below −

class MyException extends Exception {
}

You just need to extend the predefined Exception class to create your own Exception. These are considered
to be checked exceptions. The following InsufficientFundsException class is a user-defined exception that
extends the Exception class, making it a checked exception. An exception class is like any other class,
containing useful fields and methods.

Example

// File Name InsufficientFundsException.java
import java.io.*;

public class InsufficientFundsException extends Exception {
   private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}

To demonstrate using our user-defined exception, the following CheckingAccount class contains a withdraw()
method that throws an InsufficientFundsException.

// File Name CheckingAccount.java
import java.io.*;

public class CheckingAccount {
   private double balance;
   private int number;
   
   public CheckingAccount(int number) {
      this.number = number;
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) throws InsufficientFundsException {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
   public int getNumber() {
      return number;
   }
}

The following BankDemo program demonstrates invoking the deposit() and withdraw() methods of CheckingAccount.

// File Name BankDemo.java
public class BankDemo {

   public static void main(String [] args) {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      } catch (InsufficientFundsException e) {
         System.out.println("Sorry, but you are short $" + e.getAmount());
         e.printStackTrace();
      }
   }
}

Compile all the above three files and run BankDemo. This will produce the following result:
Output:

Depositing $500...

Withdrawing $100...

Withdrawing $600...
Sorry, but you are short $200.0
InsufficientFundsException
         at CheckingAccount.withdraw(CheckingAccount.java:25)
         at BankDemo.main(BankDemo.java:13)
...