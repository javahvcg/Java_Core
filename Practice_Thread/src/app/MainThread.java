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
public class MainThread extends Thread {

    private static Thread_A ta = new Thread_A();
    private static Thread_B tb = new Thread_B();
    
    public void sumRandom(int a , int b) {
        Random rd = new Random();
        a = rd.nextInt(10);
        b = rd.nextInt(10);
        System.out.println(a+b);
    }
    public static void main(String[] args) throws InterruptedException {

        ta.start();
        tb.start();
        ta.sleep(10);    
        MainThread mt = new MainThread();
        mt.sumRandom(MAX_PRIORITY, MIN_PRIORITY);
    }
}
