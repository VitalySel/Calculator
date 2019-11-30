package com.seliverstov.calculator;

import com.seliverstov.calculator.builder.Number;
import com.seliverstov.calculator.factory.OperationFactory;
import com.seliverstov.calculator.operations.Operation;

import java.math.BigDecimal;
import java.util.*;

public class ReverseExpression {

    public static Stack<Object> transform(String exp) throws Exception {
        Stack<Object> stack = new Stack<>();
        int priority;
        Number.Biulder num = new Number.Biulder();

        List<Object> calcObject = new ArrayList<>();
        List<Object> tempObject = new ArrayList<>();

        String correctedExpression = Service.correct(exp);

        for (int i = 0; i < correctedExpression.length(); i++){
            int currentIndex = i;
            char ch = correctedExpression.charAt(i);
            if (Service.check(ch)) {
                if (Character.isDigit(ch) || ch == '.') {
                        num.withNumber(ch).build();
                        if ( currentIndex == correctedExpression.length()-1)
                            calcObject.add(num.build());
                } else {
                    calcObject.add(num.build());
                    num = new Number.Biulder();
                    calcObject.add(OperationFactory.createOperation(ch));
                }
            } else {
                throw new Exception("Invalid character : " + ch);
            }
        }

        for (Object element : calcObject) {
            if (element instanceof BigDecimal){
                tempObject.add(element);
            }
            else{
                Operation operation = (Operation) element;
                priority = operation.getPriority();
                switch (priority) {
                    case 0:
                        while (!operation.checkPriority((Character) stack.peek())) {
                            tempObject.add(stack.pop());
                        }
                        stack.pop();
                        break;
                    case 1:
                        stack.push(element);
                        break;
                    case 2:
                    case 3:
                        while (!stack.empty()) {
                            Operation op = OperationFactory.createOperation((Character) stack.peek());
                            if (op.getPriority() >= priority){
                                tempObject.add(stack.pop());
                            } else break;
                        }
                        stack.push(element);
                        break;
                }
            }
        }
        while (!stack.empty()) {
            tempObject.add(stack.pop());
        }
        return Service.adding(tempObject);
    }
}




