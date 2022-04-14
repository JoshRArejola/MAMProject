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
public class timer2 extends MAM {
    
    int newBreakNo = 0;
    
    Timer timer2 = new Timer();
    TimerTask task2 = new TimerTask() {
    @Override
    
    public void run() {
        
      
        
        if(newBreakNo >0){
           
             
        newBreakNo--;
        
        System.out.println("Seconds till main break:" + newBreakNo );
        
        
        if (newBreakNo == 0) {
                    JOptionPane.showMessageDialog(null,"Take a break!");
                   
                }
        }
    }
        
    
    
    };
    
    
    
    
    
    
}
