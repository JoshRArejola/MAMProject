/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamapp;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author ztjam
 */
public class timer3 extends MAM {
    
    int newStretchNo = 0;
    
    Timer timer3 = new Timer();
    TimerTask task3 = new TimerTask() {
    @Override
    
    public void run() {
        
      
        
        if(newStretchNo >0){
           
             
        newStretchNo--;
        
        System.out.println("Seconds till stretch:" + newStretchNo );
        
        
        if (newStretchNo == 0) {
                    JOptionPane.showMessageDialog(null,"Take a Big Stretch!");
                   
                }
        }
    }
        
    
    
    };
    
    
    
    
    
    
}