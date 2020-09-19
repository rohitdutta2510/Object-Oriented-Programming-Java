package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("myString : " + myString);
        myString = myString + ", and this is more ";
        System.out.println("myString : " + myString);

        int num = 25;
        String newString = myString + num;
        System.out.println(newString);
    }
}
