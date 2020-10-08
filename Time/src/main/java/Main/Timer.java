/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABDUL AHAD KHAN
 */
public class Timer implements Runnable{
    main1 mysw;
    public Timer (main1 m1){
       mysw=m1; 
    }
    @Override
    public void run(){
        int hr=0;
        int min=0;
        int sec=0;
        try{
        while(true){
         
                Thread.sleep(1000);
                sec++;
                if(sec==60) {sec=0;
                min++;}
                if(min==60){
                    min=0;
                    hr++;}
                mysw.setTimer(hr,min,sec);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }