/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public class TransactionHandler {
    
    private int accountNo = 123456789;
    private int securityNo = 123;

    Withdraw withdraw;
    Deposit deposit;
    
    CheckAccount accChecker;
    
    public TransactionHandler(int accNo, int secNo){
        
        accountNo = accNo;
        securityNo = secNo;
        
        withdraw = new Withdraw();
        deposit = new Deposit();
        
        accChecker = new CheckAccount();
        
    }
       
   
    public void withdrawMoney(double withdrawCash){
        
          if(accountNo == accChecker.getAccountNumber() && securityNo == accChecker.getSecurityNumber()){
            System.out.println("Access Granted");
            withdraw.transaction(withdrawCash);
            
        }else{
            System.out.println("Access Dinied: invalid credentials! \n");
        }
        
    }
    
    public void depositMoney(double withdrawCash){
        
          if(accountNo == accChecker.getAccountNumber() && securityNo == accChecker.getSecurityNumber()){
            System.out.println("Access Granted");
            deposit.transaction(withdrawCash);
            
        }else{
            System.out.println("Access Dinied: invalid credentials! \n");
        }   
    }
}














