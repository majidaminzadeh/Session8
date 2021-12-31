package com.tosan.example2;

import com.tosan.example1.Person;

public class Session8_3 {
    public static void main(String[] args) {
        Person person = new Person();
        if (person instanceof Object){
            System.out.println("Yes, it is");
        }

        int[] counts = new int[3];
        if (counts instanceof Object){
            System.out.println("Yes, it is an object");
        }

        int[][] counts2 = new int[3][];
        System.out.println("length is " + counts2.length);
        counts2[0] = new int[10];
        counts2[1] = new int[5];
        counts2[2] = new int[7];
        System.out.println("[0] length is " + counts2[0].length);
        System.out.println("[1] length is " + counts2[1].length);
        System.out.println("[2] length is " + counts2[2].length);
    }
}
