package com.tosan.example1;

public class Person {
    private String name;
    private String family;
    private String idNumber;
    private Address address;
    private static String title;

    public void print(){
    }

    public static class Address{
        private String blockNumber;
        private String city;
        private String street;
        public void print(){
        }
    }

    public class NonStaticAddress{
        private String blockNumber;
        private String city;
        private String street;

        public void print(){
        }
    }
}
