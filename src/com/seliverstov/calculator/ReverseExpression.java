package com.seliverstov.calculator;

import java.util.Stack;

public class ReverseExpression {


    public static  String transform(String exp) {
        String calculation = "";
        Stack<Character> stack = new Stack<>();
        int priority;

        for (char ch: exp.toCharArray()) {
            priority = Priority.prioritization(ch);

            if (priority == 0) {
                calculation += ch;
            }

            if (priority >= 2) {
                calculation += ' ';

                while (!stack.empty()) {
                    if (Priority.prioritization(stack.peek()) >= priority) {
                        calculation += stack.pop();
                    } else break;
                }
                stack.push(ch);
            }
        }
        while (!stack.empty()) {
            calculation += stack.pop();

        }
        return calculation;
    }
}
