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
public class timer3 extends MAM {
    
    int newStretchNo = 0;
    
    Timer timer3 = new Timer();
    TimerTask task3 = new TimerTask() {
    @Override
    
    public void run() {
        
      
        
        if(newStretchNo >0){
           
             
        newStretchNo--;
        
        System.out.println("Seconds till stretch:" + newStretchNo );
        
        MAMGUI.StretchRemaining.setText ( newStretchNo + "Seconds");
        
        
        if (newStretchNo == 0) {
            timer3.cancel();
         timer3.purge();
                   JOptionPane optionPane = new JOptionPane("Please take a stretch!",JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("Warning!");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog
                }
        }
    }
        
    
    
    };
    
    
    
    
    
    
}