package com.tosan.example2;

import com.tosan.example1.Person;

public class Session8_2 {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        //...
        Person person = new Person();
        // Array
        int[] myArray = new int[10]; // int myArray0, myArray1, myArray2 ... myArray9;
        myArray[0] = 15;
        myArray[6] = 9;

//        for(int i=0;i < myArray.length; i++){
//            System.out.println("MyArray value is " + myArray[i]);
//        }
        for (int val : myArray){
            System.out.println("MyArray value is " + val);
        }
        //...
        int value = myArray[3];

        Person[] people = new Person[5];
        people[0] = new Person();
        people[0].print();

        int sizeOfArray = 10;
        int[][] values = new int[sizeOfArray][sizeOfArray];
        int i = 3;
        int  v = values[i][2];

    }
}
