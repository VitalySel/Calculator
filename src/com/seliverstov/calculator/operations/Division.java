package com.seliverstov.calculator.operations;

public class Division implements Operation {

    private Integer p;

    public Division(Integer p) {
        this.p = p;
    }

    @Override
    public Integer getP() {
        return p;
    }

    @Override
    public double result(double b, double a) {
        return b/a;
    }
}

