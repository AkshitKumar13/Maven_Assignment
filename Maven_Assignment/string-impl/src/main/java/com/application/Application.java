package com.application;
//import com.application.StringFunctions;

public class Application {
    public static void main(String[] args){

        /* Here we are making the object of StringFunction class and calling it's methods */
        String stringInput = "Hey! Buddy, how are you?";

        StringFunctions object = new StringFunctions();

        System.out.println("The original string is : Hey! Buddy, how are you?");

        System.out.println("The Reverse of the string is : " + object.stringReverse(stringInput));

        System.out.println("The Length of the string is : " + object.stringLength(stringInput));
    }
}