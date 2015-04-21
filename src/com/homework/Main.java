package com.homework;


public class Main {
    public static void main(String[] args) {
        int index = 0;

        for (String argument : args) {
            System.out.println(argument);
            index++;
        }
        System.out.println(index);
    }
}
