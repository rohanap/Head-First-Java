/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chap12;
import javax.swing.*;
/**
 *
 * @author rohan
 */
public class SimpleGui1  {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(button);
        
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    
}
