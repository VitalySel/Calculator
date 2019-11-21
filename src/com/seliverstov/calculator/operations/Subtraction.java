package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Subtraction extends Operation{

    //static final Integer PRIORITY = 2;

    public Subtraction(Integer priority) {
        super(priority);
    }

    private Subtraction(Subtraction other) {
        super();
        this.priority = other.priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.subtract(a, MathContext.DECIMAL128);
    }

    @Override
    public Operation copy() {
        return new Subtraction(this);
    }
}
