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
public class Lingkaran {
    private double jarijari;
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double getJariJari() {
        return jarijari;
    }
    
    public double getDiameter() {
        return jarijari*jarijari;
    }
    
    public double getLuas() {
        double hasil;
        hasil = this.getDiameter()*3.14;
        return hasil;
    } 
}
