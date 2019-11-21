package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Multiplication extends Operation {
    //static final Integer PRIORITY = 3;

    public Multiplication(Integer priority) {
        super(priority);
    }

    private Multiplication(Multiplication other) {
        super();
        this.priority = other.priority;
    }
    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.multiply(a, MathContext.DECIMAL128);
    }

    @Override
    public Operation copy() {
        return new Multiplication(this);
    }
}
