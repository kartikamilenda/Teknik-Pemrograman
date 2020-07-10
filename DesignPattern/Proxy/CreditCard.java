/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author asus
 */
public class CreditCard implements Pembayaran {
    
    public void pay(){
        System.out.println("Pembayaran ke rekening yang dituju berhasil.");
    }
}
