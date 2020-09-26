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
public class Accum {

    private static Accum a = new Accum();
    private int counter = 0;

    private Accum() {
    }

    public static Accum getAccum() {
        return a;
    }

    public void updateCounter(int add) {
        counter += add;
    }

    public int getCount() {
        return counter;
    }
}
