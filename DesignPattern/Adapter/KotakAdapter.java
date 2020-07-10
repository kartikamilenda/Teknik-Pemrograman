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
public class KotakAdapter extends Kotak{
    private Lingkaran circle;
    
    public KotakAdapter(Lingkaran circle) {
        this.circle = circle;
    }
    
    @Override
    public int getLuas() {
        int hasil;
        hasil = (int)circle.getLuas();
        return hasil;
    }
}
