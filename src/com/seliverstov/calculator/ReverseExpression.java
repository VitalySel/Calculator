package com.seliverstov.calculator;

import java.math.BigDecimal;
import java.util.*;

public class ReverseExpression {

    public static  Stack<Object> transform(String exp) throws Exception {
        String calculation = "";
        Stack<Character> stack = new Stack<>();
        Stack<Object> objects = new Stack<>();
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
                            calculation += ' ';
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
                                calculation += ' ';
                            } else break;
                        }
                        stack.push(ch);
                    }
                }
            } else {
                throw new Exception("Incorrect expression");
            }
        }
        while (!stack.empty()) {
            calculation += ' ';
            calculation += stack.pop();
        }

        List<String> el = new ArrayList<>(Arrays.asList(calculation.split(" ")));
        Collections.reverse(el);

        for (String ch : el) {
            if(ch.length()==1 &&MathOperation.OPERATION_MAP.containsKey(ch.charAt(0))){
                objects.push(MathOperation.OPERATION_MAP.get(ch.charAt(0)));
            }
            else{
                objects.push(BigDecimal.valueOf(Double.parseDouble(ch)));
            }
        }
        return objects;
    }
}
