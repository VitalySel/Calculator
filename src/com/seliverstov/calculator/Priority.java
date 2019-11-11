package com.seliverstov.calculator;

public  class Priority {
    public static int prioritization(char input){
            if (input == '*' || input == '/') {
                return 3;
            } else if (input == '+' || input == '-') {
                return 2;
            }
            else return 0;
    }
}

