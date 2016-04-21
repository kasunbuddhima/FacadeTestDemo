/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public class Deposit implements Bank
{

    
    
    @Override
    public void transaction(double amount) {
        checker.totAmount += amount;
        System.out.println("Deposit is completed: " + amount);
            System.out.println("Current Balance: " + checker.getTotalAmount() + "\n");
    }
    
}
