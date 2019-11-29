package com.seliverstov.calculator;

import com.seliverstov.calculator.factory.OperationFactory;

import java.math.BigDecimal;
import java.util.*;


public class Service {

    public static String correct(String exp) {
        exp = exp.replaceAll(",", ".");

        String correctedExp = new String();
        for (int i = 0; i < exp.length(); i++) {
            char sym = exp.charAt(i);
            if (sym == '-') {
                if (i == 0) correctedExp += '0';
                else if (exp.charAt(i - 1) == '(') correctedExp += '0';
            }
            correctedExp += sym;
        }
        return correctedExp;
    }

    public static boolean check(char ch) {
        return OperationFactory.OPERATION_MAP.containsKey(ch) || Character.isDigit(ch) || ch == '.';
    }

    public static Stack<Object> adding (String exp) {
        Stack<Object> objects = new Stack<>();
        List<String> el = new ArrayList<>(Arrays.asList(exp.split(" ")));
        Collections.reverse(el);

        for (String ch : el) {
            if(ch.length()==1 && OperationFactory.OPERATION_MAP.containsKey(ch.charAt(0))){
                objects.push(OperationFactory.createOperation(ch.charAt(0)));
            }
            else{
                objects.push(BigDecimal.valueOf(Double.parseDouble(ch)));
            }
        }
        return objects;
    }
}

