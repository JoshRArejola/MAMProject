/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamapp;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
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
        
        MAMGUI.WaterRemaining.setText ( newWaterNo + "Seconds");
        
        if (newWaterNo == 0) {
                 
                    // https://stackoverflow.com/questions/9119481/how-to-present-a-simple-alert-message-in-java
         JOptionPane optionPane = new JOptionPane("Please drink some water!",JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Warning!");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog

                
                }
        
        }
        
    }
        
    
    
    };
    
    
    
    
    
    
}
