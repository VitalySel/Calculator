package com.seliverstov.calculator;

import java.util.Stack;

public class ReverseExpression {

    public static  String transform(String exp) {
        String calculation = "";
        Stack<Character> stack = new Stack<>();
        int priority;

        for (char ch: exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                calculation += ch;
            }
            if (MathOperation.OPERATION_MAP.containsKey(ch)) {
                priority = MathOperation.OPERATION_MAP.get(ch).getPriority();

                if (priority == 0) {
                    while(MathOperation.OPERATION_MAP.get(stack.peek()).getPriority() != 1) {
                        calculation += stack.pop();
                    }
                    stack.pop();
                }

                if (priority == 1) {
                    stack.push(ch);
                }

                if (priority >= 2) {
                    calculation += ' ';
                    while (!stack.empty()) {
                        if (MathOperation.OPERATION_MAP.get(stack.peek()).getPriority() >= priority)
                        {
                            calculation += stack.pop();
                        } else break;
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.empty()) {
            calculation += stack.pop();

        }
        return calculation;
    }
}
