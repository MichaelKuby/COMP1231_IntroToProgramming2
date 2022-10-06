
//----------------------------------------------------------------------------------
// Account.java        Assignment 2: Question 2 - Lockable
//
// Represents a bank account with basic services such as deposit and withdraw.
// Implements the Lockable interface, so methods can be protected.
//
// Michael Kuby
// October 9, 2021
//----------------------------------------------------------------------------------

import java.text.NumberFormat;

public class Account implements Lockable
{
    private final double RATE = 0.035; // interest rate of 3.5%
    
    private String name;
    private long acctNumber;
    private double balance;
    
    // Set up instance variables required by Lockable interface
    private int key; 
    private boolean locked;
    
    //----------------------------------------------------------------------------------
    // Constructor: Sets up this account with the specified owner, account number, and initial balance.
    //----------------------------------------------------------------------------------
    public Account(String name, long acctNumber, double balance)
    {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    //----------------------------------------------------------------------------------
    // Deposits the specified amount into this account and returns the new balance.
    // The balance is not modified if the deposit amount is invalid.
    //----------------------------------------------------------------------------------
    public Double deposit(double amount)
    {
        Double result = null;
        
        if (locked)
        {
            System.out.println ("Your account is locked");
        }
        else if (amount > 0)
        {
            balance += amount;
            result = balance;
        }
        
        return result;
    }
    
    //----------------------------------------------------------------------------------
    // Withdraws the specified amount and fee from this account and returns the new balance.
    // The balance is not modified if the withdraw amount is invalid or the balance is insufficient.
    //----------------------------------------------------------------------------------
    public Double withdraw (double amount, double fee)
    {
        Double result;
        
        if (!locked)
        {
            if (amount + fee > 0 && amount + fee < balance)
                balance = balance - amount - fee;
                result = balance;
        }
        else
        {
            System.out.println ("Your account is locked");
            result = null;    
        }
            
        return result;
    }
    
    //----------------------------------------------------------------------------------
    // Adds interest to this account and returns the new balance.
    //----------------------------------------------------------------------------------
    public Double addInterest()
    {
        Double result;
        
        if (!locked)
        {
            balance += (balance * RATE);
            result = balance;    
        }
        else
        {
            System.out.println ("Your account is locked");
            result = null;
        }
            
        return result;
    }
    
    //----------------------------------------------------------------------------------
    // Returns the current balance of this account.
    //----------------------------------------------------------------------------------
    public Double getBalance()
    {
        Double result;
        
        if (!locked)
            result = balance;
        else
        {
            System.out.println ("Your account is locked");
            result = null;
        }
        
        return result;
    }
    
    //----------------------------------------------------------------------------------
    // Returns a one-line description of this account as a string.
    //----------------------------------------------------------------------------------
    public String toString()
    {
        String str;
        
        if (!locked)
        {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
            str = acctNumber + "\t" + name + "\t" + fmt.format(balance);    
        }
        else
        {
            str = "Your account is locked";
        }
        
        return str;
    }
    
    //----------------------------------------------------------------------------------
    // Set the key used to lock and unlock the object
    //--------------------------------------------------------------------------------- 
    public void setKey (int key)
    {
        this.key = key;
    }
    
    //----------------------------------------------------------------------------------
    // Get the key used to lock and unlock the object
    //--------------------------------------------------------------------------------- 
    public int getKey ()
    {
        return key;
    }
    
    //----------------------------------------------------------------------------------
    // Lock the objects methods
    //----------------------------------------------------------------------------------
    public void lock (int key)
    {
        if (this.key == key)
            locked = true;
    }
    
    //----------------------------------------------------------------------------------
    // Unlock the objects methods
    //----------------------------------------------------------------------------------
    public void unlock (int key)
    {
        if (this.key == key)
            locked = false;
    }
    
    //----------------------------------------------------------------------------------
    // Report whether or not the object is currently locked.
    //----------------------------------------------------------------------------------
    public boolean locked ()
    {
        return locked;
    }
}
