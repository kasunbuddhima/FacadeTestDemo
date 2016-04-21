/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public interface Bank {
    
    CheckAccount checker = new CheckAccount();

    public void transaction(double amount);
       
}
