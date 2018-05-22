/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipod;

/**
 *
 * @author Henna
 */
public class killClass implements Runnable{

    @Override
    public void run() {
        System.exit(0);
    }
    
}
