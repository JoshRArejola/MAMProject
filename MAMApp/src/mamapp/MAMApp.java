/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamapp;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ztjam
 */
public abstract class MAMApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MAMGUI myGUI = new MAMGUI();
        myGUI.setVisible(true);
            try {
      File myObj = new File("MAMcalender.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    }
    
}
