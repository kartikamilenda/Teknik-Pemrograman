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
public class ProxyCreditCard implements Pembayaran {
    
    private CreditCard creditCard;
    private Valid valid;
    
    public ProxyCreditCard (Valid valid){
        this.valid = valid;
        creditCard = new CreditCard();
    }
    
    public void pay(){
        if(valid.isChecked()){
            creditCard.pay();
        }else{
            System.out.println("Transaksi tidak berhasil!");
        }
    }
}