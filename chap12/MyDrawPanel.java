/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chap12;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rohan
 */
public class MyDrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random()) * 256;

        Color startColor = new Color(red, green, blue);
        
         red = (int) (Math.random() * 256);
         green = (int) (Math.random() * 256);
         blue = (int) (Math.random()) * 256;

        Color endColor = new Color(red, green, blue);
        
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        g2d.setPaint(gradient);

        g2d.fillOval(70, 70, 70, 70);
    }

}
