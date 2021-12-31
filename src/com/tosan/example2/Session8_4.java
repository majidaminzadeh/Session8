package com.tosan.example2;

import javax.swing.*;

public class Session8_4 {
    public static void main(String[] args) {
        int[] counts = new int[]{1,20,13,4};
        for(int count : counts){
            System.out.println("count is " + count);
        }

        int[] counts2 = {4, 7, 0};

        for(int count : counts2){
            System.out.println("count is " + count);
        }

        String[] strs = new String[]{new String("tosan"), "majid"};
        for(String val : strs){
            System.out.println("val is " + val);
        }
    }
}
