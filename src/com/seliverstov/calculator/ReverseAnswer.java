package com.seliverstov.calculator;

import java.math.BigDecimal;
import java.util.Stack;

public class ReverseAnswer {

    public static BigDecimal answer(String ans) {
        String operand = "";
        Stack<BigDecimal> stack = new Stack<>();
        Integer priority ;

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == ' ') continue;
            if (Character.isDigit(ans.charAt(i)) || ans.charAt(i) == '.') {
                while (ans.charAt(i) != ' ' && (Character.isDigit(ans.charAt(i)) || ans.charAt(i) == '.')) {
                    operand += ans.charAt(i);
                    i++;
                }
                stack.push(BigDecimal.valueOf(Double.parseDouble(operand)));
                i--;
                operand = "";
            }

                if(MathOperation.OPERATION_MAP.containsKey(ans.charAt(i))) {
                    priority = MathOperation.OPERATION_MAP.get(ans.charAt(i)).getPriority();
                    if (priority >= 2) {

                        BigDecimal a = stack.pop();
                        BigDecimal b = stack.pop();

                        stack.push(MathOperation.OPERATION_MAP.get(ans.charAt(i)).result(b, a));
                    }
                }
        }
        return stack.pop();
    }
}
