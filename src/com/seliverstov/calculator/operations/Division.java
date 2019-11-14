package com.seliverstov.calculator.operations;

import java.math.BigDecimal;

public class Division implements Operation {

    private Integer priority;
    public Division(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public double result(double b, double a) {
        return b/a;
    }
}

