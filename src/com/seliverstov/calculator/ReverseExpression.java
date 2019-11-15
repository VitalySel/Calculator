package com.seliverstov.calculator;

import java.util.Stack;

public class ReverseExpression {

    public static  String transform(String exp) throws Exception {
        String calculation = "";
        Stack<Character> stack = new Stack<>();
        int priority;

        exp = exp.replaceAll(",",".");
        String correctedExpression = MathOperation.correct(exp);

        for (char ch: correctedExpression.toCharArray()) {

            if (MathOperation.OPERATION_MAP.containsKey(ch) || Character.isDigit(ch) || ch == '.' || ch == ' ') {

                if (Character.isDigit(ch) || ch == '.') calculation += ch;
                if (MathOperation.OPERATION_MAP.containsKey(ch)) {
                    priority = MathOperation.OPERATION_MAP.get(ch).getPriority();

                    if (priority == 0) {
                        while (MathOperation.OPERATION_MAP.get(stack.peek()).getPriority() != 1) {
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
                            if (MathOperation.OPERATION_MAP.get(stack.peek()).getPriority() >= priority) {
                                calculation += stack.pop();
                            } else break;
                        }
                        stack.push(ch);
                    }
                }
            } else {
                throw new Exception("Incorrect expression");
            }
        }
        while (!stack.empty()) calculation += stack.pop();

        return calculation;
    }
}
