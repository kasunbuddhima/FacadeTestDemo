/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetestdemo;

/**
 *
 * @author kasun
 */
public class FacadeTestDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TransactionHandler transHandler = new TransactionHandler(123456789, 123);
        
        transHandler.withdrawMoney(1500);
        transHandler.depositMoney(200);
    }
}
