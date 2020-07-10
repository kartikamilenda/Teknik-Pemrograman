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
public class Kotak {
    private int sisi;
    
    public Kotak() {}
    
    public Kotak(int sisi) {
        this.sisi = sisi;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public int getLuas() {
        int hasil;
        hasil = sisi*sisi;
        return hasil;
    }
}
