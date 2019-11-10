package com.company;

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

class PriorityException extends Exception{
    private char symbol;
    public char getSymbol() {
        return symbol;
    }

    public PriorityException(String message, char symbol) {
        super(message);
        this.symbol = symbol;
    }
}
