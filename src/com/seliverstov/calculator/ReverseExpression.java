package com.seliverstov.calculator;

import com.seliverstov.calculator.builder.Number;
import com.seliverstov.calculator.factory.OperationFactory;
import com.seliverstov.calculator.operations.Operation;

import java.util.*;

public class ReverseExpression {

    public static  Stack<Object> transform(String exp) throws Exception {
        String calculation = "";
        Stack<Object> stack = new Stack<>();
        int priority;
        Number.Biulder num = new Number.Biulder();

        String correctedExpression = Service.correct(exp);

        for (char ch: correctedExpression.toCharArray()) {
            if (Service.check(ch)) {

                if (Character.isDigit(ch) || ch == '.') {
                        num.withNumber(ch).build();

                } else {
                    calculation += num.build();
                    num = new Number.Biulder();

                    Operation operation = OperationFactory.createOperation(ch);
                    priority = operation.getPriority();

                    switch (priority) {
                        case 0:
                            while (!operation.checkPriority((Character) stack.peek())) {
                                calculation += ' ';
                                calculation += stack.pop();
                            }
                            stack.pop();
                            break;
                        case 1:
                            stack.push(ch);
                            break;
                        case 2:
                        case 3:
                            calculation += ' ';
                            while (!stack.empty()) {
                                Operation op = OperationFactory.createOperation((Character) stack.peek());
                                if (op.getPriority() >= priority) {
                                    calculation += stack.pop();
                                    calculation += ' ';
                                } else break;
                            }
                            stack.push(ch);
                            break;
                    }
                }
            }
            else {
                throw new Exception("invalid character : "+ ch);
            }
        }

        while (!stack.empty()) {

            calculation += num.build();
            num = new Number.Biulder();

            calculation += ' ';
            calculation += stack.pop();
    }
        return Service.adding(calculation);
    }
}
