package com.seliverstov.calculator;

/*Написать консольное приложение - калькулятор и залить на GitHub.
Основные операции - сложение, вычитание, умножение, деление.
Обработка сложных выражений со скобками. Пример - 5*(2+1) + 5/2 * 3
Срок - 10 дней. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Expression - ");

            try {
                String expressionInput = sc.nextLine();
                String expressionOutput = ReverseExpression.transform(expressionInput);
                System.out.println("Answer Expression - " + ReverseAnswer.answer(expressionOutput));

            } catch (Exception exp) {

                System.out.println(exp.getMessage());
            }
        }
    }

}
