/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chap15;

/**
 *
 * @author rohan
 */
public class ThreadOne implements Runnable {

    Accum a = Accum.getAccum();

    public void run() {

        for (int i = 0; i < 98; i++) {
            a.updateCounter(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("one " + a.getCount());
    }
}
