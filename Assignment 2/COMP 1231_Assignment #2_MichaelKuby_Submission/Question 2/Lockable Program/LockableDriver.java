
//----------------------------------------------------------------------------------
// LockableDriver.java            Assignment 2: Question 2 - Lockable
//
// A driver class designed to demonstrate the behaviours of Lockable objects using Account and Coin classes.
//
// Michael Kuby
// Oct 9 2021
//----------------------------------------------------------------------------------

import java.util.Scanner;
import java.text.NumberFormat;

public class LockableDriver
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println ("This program is designed to illustrate the behaviours of Lockable objects using an instance each of an account and a coin.\n");
        
        //---------------------------------------------------------------------------
        // Prompt the user to set up an account
        //---------------------------------------------------------------------------
        System.out.println ("Let's first create an account");
        
        System.out.print ("\nPlease enter the name of the account holder: ");
        String name = keyboard.nextLine();
        
        System.out.print ("Please enter the account number: ");
        int acctNumber = keyboard.nextInt();
        
        System.out.print ("Please enter the starting balance: ");
        double balance = keyboard.nextDouble();
        
        Lockable acct1 = new Account (name, acctNumber, balance); // Sets up the account and references it via a Lockable reference variable
        
        System.out.print ("Please enter a numerical key you will use to secure your account: ");
        int key = keyboard.nextInt();
        
        acct1.setKey(key);  // set the key for the account
        acct1.lock(key);    // lock the account
        
        //---------------------------------------------------------------------------
        // Prompts the user to a use their account in various ways while locked
        //---------------------------------------------------------------------------
        System.out.print ("\nLet's make a deposit. Please enter the amount: ");
        double depositAmnt = keyboard.nextDouble();
        ((Account)acct1).deposit(depositAmnt);
        
        System.out.println();
        
        System.out.print ("Lets withdraw some funds. How much would you like to withdraw? ");
        double withdrawAmnt = keyboard.nextDouble();
        ((Account)acct1).withdraw(withdrawAmnt, 2.75);
        
        System.out.println();
        
        System.out.println ("Adding interest to your account...");
        ((Account)acct1).addInterest();
        
        System.out.println();
        
        System.out.println ("Getting the balance of your account...");
        ((Account)acct1).getBalance();
        
        System.out.println();
        
        System.out.println ("A detailed report regarding your account: ");
        System.out.println ((Account)acct1);
        
        //---------------------------------------------------------------------------
        // Prompts the user to unlock the account and retry the previos operations.
        //---------------------------------------------------------------------------
        System.out.print ("\nLet's unlock your account and try this again. Please enter the pass key: ");
        int keyPass = keyboard.nextInt();
        
        while (key != keyPass)
        {
            System.out.print ("Incorrect key. Account is still locked. Please re-enter: ");
            keyPass = keyboard.nextInt();
        }
        
        acct1.unlock(keyPass);
        System.out.println ("Account unlocked.");
        
        System.out.print ("\nLet's make a deposit. Please enter the amount: ");
        depositAmnt = keyboard.nextDouble();
        ((Account)acct1).deposit(depositAmnt);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println ("Your new balance is: " + fmt.format(((Account)acct1).getBalance()));
        
        System.out.println();
        
        System.out.print ("Lets withdraw some funds. How much would you like to withdraw? ");
        withdrawAmnt = keyboard.nextDouble();
        ((Account)acct1).withdraw(withdrawAmnt, 2.75);
        System.out.println ("Your new balance is: " + fmt.format(((Account)acct1).getBalance()));
        
        System.out.println();
        
        System.out.println ("Adding interest to your account...");
        ((Account)acct1).addInterest();
        
        System.out.println();
        
        System.out.println ("A detailed report regarding your account: ");
        System.out.println ((Account)acct1);
        
        System.out.println ("\n\n");
        System.out.println ("---------------------------------------------------------------------------------------------");
        System.out.println ("\n\n");
        
        //---------------------------------------------------------------------------
        // Instantiates a coin and excercises it's lockable aspects
        //---------------------------------------------------------------------------
        Lockable coin1 = new Coin();
        coin1.setKey(7658);
        coin1.lock(7658);
        
        System.out.println ("Oh would you look at that, a wild coin appeared. I'll try to flip it!");
        ((Coin)coin1).flip();
         
        System.out.println ("\nI wonder if it's heads or tails?");
        System.out.println ((Coin) coin1);
        
        System.out.println ("\nLooks like we have to unlock this thing.\nI have a strange feeling the key to unlock it is 7658.");
        System.out.print ("\nEnter the key to unlock the coin: ");
        key = keyboard.nextInt();
        
        while (key != 7658)
        {
            System.out.println ("That's not the key I gave you.");
            System.out.print ("Enter the key to unklock the coin: ");
            key = keyboard.nextInt();
        }
        
        coin1.unlock(key);
        
        ((Coin)coin1).flip();
        System.out.println ("\nNice. I just flipped it. It came up " + (Coin)coin1 + ".");
        
        ((Coin)coin1).flip();
        System.out.println ("\nI flipped it again. It came up " + (Coin)coin1 + ".");
    }
}
