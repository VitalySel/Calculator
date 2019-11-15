package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Subtraction implements Operation {
    private Integer priority;

    public Subtraction(Integer priority) {
        this.priority =priority;
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
