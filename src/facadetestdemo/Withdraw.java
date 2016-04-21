/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public class Withdraw implements Bank {

    @Override
    public void transaction(double amount) {
        
        if(amount > checker.getTotalAmount()){
         
            System.out.println("Sorry, You cannot have enough money to withdraw");
            System.out.println("Current Balance: " + checker.getTotalAmount() + "\n");
        
        }else{
            checker.totAmount -= amount;
            System.out.println("Withdrawn is completed: " + amount);
            System.out.println("Current Balance: " + checker.getTotalAmount() + "\n");
            
        }
             
    }
    
}
