package com.seliverstov.calculator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args)  {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Expression - ");

            try {
                String expressionInput = sc.nextLine();
                Stack<Object> expressionOutput = ReverseExpression.transform(expressionInput);
                System.out.println("Answer Expression - " + ReverseAnswer.answer(expressionOutput));

            } catch (Exception exp) {
                System.out.println(exp.getMessage());
            }
        }
    }

}
