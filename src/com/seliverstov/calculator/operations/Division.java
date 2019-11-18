package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Division extends Operation {

    public Division(Integer priority) {
        super(priority);
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

