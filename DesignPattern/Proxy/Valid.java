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
public class Valid {
    private boolean checked;
    
    public Valid (final boolean checked){
        this.checked = checked;
    }
    
    public boolean isChecked(){
        return checked;
    }
    
    public void setChecked(boolean checked){
        this.checked = checked;
    }   
}
