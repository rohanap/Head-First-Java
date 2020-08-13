/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chap12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rohan
 */
public class SimpleGui1B implements ActionListener{
    
    JButton button;
    
    public static void main(String[] args) {
    SimpleGui1B gui = new SimpleGui1B();
    gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        button.setText("I've been clicked!");
    }
}
