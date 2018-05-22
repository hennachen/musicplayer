/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipod;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author Henna
 */
public class MP3Class implements Runnable{

    @Override
    public void run() {
        Player player = null;
    
        
        try {
            FileInputStream fis = new FileInputStream("chinesebook.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            synchronized(this){
            player = new Player(bis);
                }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            player.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    
    }

    }
    

