package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Multiplication extends Operation {

    public Multiplication(Integer priority) {
        super(priority);
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.multiply(a, MathContext.DECIMAL128);
    }
}
