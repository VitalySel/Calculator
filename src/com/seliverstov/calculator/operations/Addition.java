package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Addition implements Operation {

    private Integer priority;

    public Addition(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.add(a, MathContext.DECIMAL128);
    }
}
