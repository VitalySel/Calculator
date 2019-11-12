package com.seliverstov.calculator;

import com.seliverstov.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class MathOperation {
    public static final Map<Character, Operation> OPERATION_MAP = new HashMap<>();

    static {
        OPERATION_MAP.put('+', new Addition(2));
        OPERATION_MAP.put('-', new Subtraction(2));
        OPERATION_MAP.put('*', new Multiplication(3));
        OPERATION_MAP.put('/', new Division(3));
    }
}
