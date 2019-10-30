//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

public class Account
{
  /*---Data fields: each Account object keeps track 
  of its balance, name and acct # ---*/  
  private double balance;
  private String name;
  private int acctNum;

  /*----------------------------------------------
  3 - arg Constructor: initializes balance, owner, and 
  account number
  ----------------------------------------------*/
  public Account(double initBal, String owner, int number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

/*-----------------------------------------------
  Method: withdraw
  Precondition: amount must be some numeric value
  Postcondition: deducts amount from balance if 
  sufficient funds exist
-------------------------------------------------*/
  public void withdraw(double amount)
  {
    if (balance >= amount)//checks to see if balance is sufficient for withdrawal.
       balance -= amount; //If so, decrements balance by amount
    else//if not, prints message.
       System.out.println("Insufficient funds");
  }

/*-------------------------------------------------
  Method: deposit
  Precondition: amount must be some numeric value
  Postcondition: adds amount to balance 
---------------------------------------------------*/
  public void deposit(double amount)
  {
    balance += amount;
  }

  /*----------------------------------------------
   Accessor method: getBalance
    Precondition: N/A
    Postcondition: Returns balance.
  ----------------------------------------------*/
  public double getBalance()
  {
    return balance;
  }

   /*----------------------------------------------
     Method: printSummary
     Precondition: N/A
     Postcondition: Prints Name: (Actual Name)
                           Account #: (Actual Account number)
                           Balance: (Actual balance)
   ----------------------------------------------*/
  public void printSummary()
  {
    //print name

    //print acct number

    //print balance

  }

   /*----------------------------------------------
     Method: chargeFee
     Precondition: N/A
     Postcondition: Deducts $10 service fee if 
     balance is under $1000
   ----------------------------------------------*/
  public void chargeFee()
  {
    


  }

  /*----------------------------------------------
    Modifier method: changeName 
    Precondition: newName must be some String object
    Postcondition: Changes the name on the account to newName
  ----------------------------------------------*/
  public void changeName(String newName)                          
  {
    


  }

}
