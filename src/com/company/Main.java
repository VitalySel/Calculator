package com.company;

/*Написать консольное приложение - калькулятор и залить на GitHub.
Основные операции - сложение, вычитание, умножение, деление.
Обработка сложных выражений со скобками. Пример - 5*(2+1) + 5/2 * 3
Срок - 10 дней. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {

                System.out.print("Enter Expression - ");
                String ExpessionInput = br.readLine();
                String ExpessionOutput = ReverseExpression.transform(ExpessionInput);
                System.out.println("Answer Expression - " + ReverseAnswer.answer(ExpessionOutput));

            } catch (Exception exp) {

                System.out.println(exp.getMessage());
            }
        }
    }

}
