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
public class MainProxy {
    public static void main(String[] args){
        
        //Jika transaksi berhasil
        boolean cek = true;
        Valid akunValid = new Valid(cek);
        ProxyCreditCard proxyCC = new ProxyCreditCard(akunValid);
        proxyCC.pay();
        System.out.println();
        //Jika transaksi gagal
        boolean cek2 = false;
        Valid akunValid2 = new Valid(cek2);
        ProxyCreditCard proxyCC2 = new ProxyCreditCard(akunValid2);
        proxyCC2.pay();
    }
}
