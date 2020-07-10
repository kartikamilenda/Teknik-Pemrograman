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
public class Pembanding {
        public Pembanding(int bangunDatar1, int bangunDatar2) {
        if(bangunDatar1 == bangunDatar2) {
            System.out.println("Luas kedua bangun datar sama.");
        }
        if(bangunDatar1 > bangunDatar2) {
            System.out.println("Luas bangun datar pertama lebih besar daripada yang kedua.");
        }
        if(bangunDatar2 > bangunDatar1) {
            System.out.println("Luas bangun datar kedua lebih besar daripada yang pertama.");
        }
    }
}
