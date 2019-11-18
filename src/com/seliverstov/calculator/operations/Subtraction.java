package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Subtraction extends Operation{

    public Subtraction(Integer priority) {
        super(priority);
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.subtract(a, MathContext.DECIMAL128);
    }
}
