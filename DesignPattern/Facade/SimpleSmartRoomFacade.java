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
public class SimpleSmartRoomFacade {
    private Light lampu;
    private AirConditioner ac;
    private NightLamp lampuTidur;
    
    public SimpleSmartRoomFacade(Light lampu, AirConditioner ac, 
            NightLamp lampuTidur){
        this.lampu = lampu;
        this.ac = ac;
        this.lampuTidur = lampuTidur;
    }
    
    public void ModeSiang(){
        lampu.off();
        ac.on();
        lampuTidur.off();
    }
    
    public void ModeSore(){
        lampu.on();
        ac.on();
        lampuTidur.off();
    }
    
    public void ModeMalam(){
        lampu.off();
        ac.off();
        lampuTidur.off();
    }
    
    public void ModeKosong(){
        lampu.off();
        ac.off();
        lampuTidur.off();
    }   
}
