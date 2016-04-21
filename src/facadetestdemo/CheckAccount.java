/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public class CheckAccount {
    
    private int accountNo = 123456789;
    private int securityNo = 123;
    protected double totAmount = 1000;
    
     public double getTotalAmount(){
        return totAmount;
    }
     
     public int getAccountNumber(){
        return accountNo;
    }
    public int getSecurityNumber(){
        return securityNo;
    }
    
}
