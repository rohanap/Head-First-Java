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
public class ThreadTeaster {
    public static void main(String[] args) {
        
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        
        myThread.start();
        System.out.println("back in main");
    }
}
