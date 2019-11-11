package com.seliverstov.calculator;

import com.seliverstov.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class MathOperation {

    private char operation;
    private double operandOne;
    private double operandTwo;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public MathOperation(double operandOne, double operandTwo, char operation) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;

        operationMap.containsKey(operation);
        operationMapValue = operationMap.get(operation);

        return operationMapValue.result(operandOne, operandTwo);
    }
}
