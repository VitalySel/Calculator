package com.company;

import java.util.Stack;

public class ReverseExpression {


    public static  String transform(String Exp) throws PriorityException {
        String calculation = "";
        Stack<Character> stack = new Stack<>();
        int priority;

        for (int i = 0; i < Exp.length(); i++) {
            priority = Priority.prioritization(Exp.charAt(i));

            if (priority == 0) {
                calculation += Exp.charAt(i);
            }

            if (priority >= 2) {
                calculation += ' ';

                while (!stack.empty()) {
                    if (Priority.prioritization(stack.peek()) >= priority) {
                        calculation += stack.pop();
                    } else break;
                }
                stack.push(Exp.charAt(i));
            }
        }
        while (!stack.empty()) {
            calculation += stack.pop();

        }
        return calculation;
    }
}
