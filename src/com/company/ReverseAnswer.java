package com.company;

import java.util.Stack;

public class ReverseAnswer {


    public static double answer(String ans) {
        String operand = "";
        Stack<Double> stack = new Stack<>();


        int priority;
        for (int i = 0; i < ans.length(); i++) {
            priority = Priority.prioritization(ans.charAt(i));

            if (ans.charAt(i) == ' ') continue;
            if (priority == 0) {
                while (ans.charAt(i) != ' ' && Priority.prioritization(ans.charAt(i)) == 0) {
                        operand += ans.charAt(i);
                        i++;
                        if (i == ans.length()) break;
            }
                stack.push(Double.parseDouble(operand));
                i--;
                operand = "";
            }

            if (priority >= 2) {

                double a = stack.pop();
                double b = stack.pop();


                if (ans.charAt(i) == '+') {
                    stack.push(b + a);
                }
                if (ans.charAt(i) == '-') {
                    stack.push(b - a);
                }
                if (ans.charAt(i) == '*') {
                    stack.push(b * a);
                }
                if (ans.charAt(i) == '/') {
                    stack.push(b / a);
                    }

                }
            }
        return stack.pop();
    }
}
