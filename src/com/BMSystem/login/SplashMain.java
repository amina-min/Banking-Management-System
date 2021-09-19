/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BMSystem.login;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SplashMain {
    public static void main(String[] args) {
         Loading sp = new Loading();
        sp.setVisible(true);

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
                String s = Integer.toString(i);
                //Loading.jLabel.setText(s + "%");
               // Loading.progress.setValue(i);

                if (i == 100) {
                    Login login = new Login();
                    sp.setVisible(false);
                    login.setVisible(true);

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
    }
    
    
}
