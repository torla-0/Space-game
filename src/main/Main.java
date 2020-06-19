/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;



public class Main {

    static SwingWorker we;

    

    
    public static void main(String[] args) {


            try {

                 SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {

                            StartWindow start = new StartWindow();
                            start.setVisible(true);
                            start.setLocationRelativeTo(null);
                    }
                });
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
        }   
    }





    
    


