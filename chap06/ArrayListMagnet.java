/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chap06;

import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);
        a.remove(2);
        if(a.contains("two")){
           a.add("2.2");
        }
        //printAL(a);
        if(a.contains("three")){
           a.add("four");
        }
        printAL(a);
        if(a.indexOf("four") !=4){
            a.add(4, "4.2");
        }
        printAL(a);
        printAL(a);
    }

    private static void printAL(ArrayList<String> al) {
        for(String elements : al){
            System.out.print(elements +" ");
        }
        System.out.println("");
        }
    }

