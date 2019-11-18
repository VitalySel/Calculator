package com.seliverstov.calculator;

public class Service {
    public static String correct(String exp) {
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
            return MathOperation.OPERATION_MAP.containsKey(ch) || Character.isDigit(ch) || ch == ' ' || ch == '.';
    }
}
