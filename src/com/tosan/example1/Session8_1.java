package com.tosan.example1;

public class Session8_1 {
    public static void main(String[] args) {
//        Person.Address address = new Person.Address();
//        Person person = new Person();
//        Person.NonStaticAddress address1 = person.new NonStaticAddress();
        JariDeposit deposit = new JariDeposit() {
            int p;
            public void print(){
                System.out.println("Print");
            }
        };
        if(deposit instanceof JariDeposit){
            System.out.println("Jari: YES");
        } else {
            System.out.println("Jari: No");
        }

        if(deposit instanceof Deposit){
            System.out.println("deposit: YES");
        } else {
            System.out.println("deposit: No");
        }
        deposit.defray(10);
    }
}
