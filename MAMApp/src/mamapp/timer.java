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
public class timer extends MAM {
    
    int newWaterNo = 0;
    
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
    @Override
    
    public void run() {
        
      
        
        if(newWaterNo >0){
           
             
        newWaterNo--;
        
        System.out.println("Seconds till water break:" + newWaterNo );
        
        
        if (newWaterNo == 0) {
                    JOptionPane.showMessageDialog(null,"Drink Water!");
                   
                }
        }
    }
        
    
    
    };
    
    
    
    
    
    
}
