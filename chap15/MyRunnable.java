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
public class MyRunnable implements Runnable{
    
    public void run(){
        go();
    }
    
    public void go(){
        doMore();
    }
    
    public void doMore(){
        System.out.println("top o' the stack");
    }
    
}
