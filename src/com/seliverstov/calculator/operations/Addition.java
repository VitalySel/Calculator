package com.seliverstov.calculator.operations;

public class Addition implements Operation {
    @Override
    public double result(double b, double a) {
        return b+a;
    }
}
