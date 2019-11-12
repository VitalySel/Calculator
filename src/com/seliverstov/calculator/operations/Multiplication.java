package com.seliverstov.calculator.operations;

public class Multiplication implements Operation {

    private Integer p;

    public Multiplication(Integer p) {
        this.p = p;
    }

    @Override
    public Integer getP() {
        return p;
    }

    @Override
    public double result(double b, double a) {
        return b*a;
    }
}
