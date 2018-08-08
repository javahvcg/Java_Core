/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author anhquan12
 */
public class Thread_A extends Thread {

    @Override
    public void run() {
        Random rd = new Random();
        int a = rd.nextInt(10);
        System.out.println(a);
        
    }
}
