/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package givingchange;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author user
 */
public class GivingChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /* Create a new Java application called “GivingChange” (without the quotation marks) to determine how the cashier should give change.  
Prompt the user for two values: the amount due and the amount received from the customer.  In order to avoid roundoff errors, 
the program user should supply both amounts in pennies, for example 356 instead of 3.56.  
Display the number of dollars, quarters, dimes, nickels, and pennies that the customer should receive in return.  
You may need to consider casting the values. Be sure to get the remaining change following each coin calculation 
(Hint: consider using modulus division).*/
        

      Scanner myScanner = new Scanner(System.in);
      System.out.print("Enter the amount paid for the item: $");
      double amountPaid = myScanner.nextDouble();
      System.out.println("");
      System.out.print("Enter the amount you're giving to the cashier: $");
      double amountGiven = myScanner.nextDouble();
      
      double changeDue = ( (double)((int) Math.round((amountGiven - amountPaid) * 100)) / 100.0 );
      double quarterMod = changeDue % 0.25;
      double quarters = ( (double)((int) Math.round(quarterMod * 100)) / 100.0 );
      double dimeMod = quarters % 0.10;
      double dimes = ( (double)((int) Math.round(dimeMod * 100)) / 100.0 );
      double nickelMod = quarters % 0.05;
      double nickels = ( (double)((int) Math.round(nickelMod * 100)) / 100.0 );
      double pennyMod = quarters % 0.01;
      double pennies = ( (double)((int) Math.round(pennyMod * 100)) / 100.0 );
      
      int numQuarters = (int)((changeDue - quarters) / (0.25));
      int numDimes = (int)((quarters - dimes) / (0.10));
      int numNickels = (int)((dimes - nickels) / (0.05));
      int numPennies = (int)((nickels - pennies) / (0.01));
      
      System.out.println("Your change is " + changeDue);
      System.out.println("Dispensing coins... ");
      System.out.println("");
      System.out.println("Quarters: " + numQuarters);
      System.out.println("Dimes: " + numDimes);
      System.out.println("Nickels: " + numNickels);
      System.out.println("Pennies: " + numPennies);
      
   }
   /* System.out.println("Dollars: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);*/
    
    
    
    
        
        
    }
    
