package com.tosan.example3;

import com.sun.org.apache.xpath.internal.operations.String;

public class Session8_5 {
    public static void main(String[] args){
        // Error
        // Exception -> 1-CHECKED(COMPILE TIME) 2-UNCHECKED(RUNTIME)
        try{
            exceptionExample();
            System.out.println("Something");
        } catch(Exception exception){
            System.out.println("Catch called");
        }
    }

    private static void exceptionExample() throws Exception{
        int age = -1;
        if(age <= 0){
//            System.out.println("Age is wrong");
            throw new Exception();
        } else {
            System.out.println("Your age is " + age);
        }
        System.out.println("I am doing something with age");
    }
}
