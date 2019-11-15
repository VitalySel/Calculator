package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

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
    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return b.divide(a, MathContext.DECIMAL128);
    }
}

