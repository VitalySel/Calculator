package com.seliverstov.calculator.factory;

import com.seliverstov.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {

    public static final Map<Character, Operation> OPERATION_MAP = new HashMap<>();

    static {

        OPERATION_MAP.put(')', new RightBracket(0));
        OPERATION_MAP.put('(', new LeftBracket(1));
        OPERATION_MAP.put('+', new Addition(2));
        OPERATION_MAP.put('-', new Subtraction(2));
        OPERATION_MAP.put('*', new Multiplication(3));
        OPERATION_MAP.put('/', new Division(3));
    }

    public static Operation createOperation(Character ch) {
        return OPERATION_MAP.get(ch).copy();
    }
}
