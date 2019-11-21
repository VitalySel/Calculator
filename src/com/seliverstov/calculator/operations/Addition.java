package com.seliverstov.calculator.operations;

import java.math.BigDecimal;
import java.math.MathContext;

public class Addition extends Operation {
    //private Integer PRIORITY = 2;

    public Addition(Integer priority) {
        super(priority);
    }

    private Addition(Addition other) {
        super();
        this.priority = other.priority;
    }
    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public BigDecimal result(BigDecimal b , BigDecimal a) {
        return b.add(a,MathContext.DECIMAL128);
    }

    @Override
    public Operation copy() {
        return new Addition(this);
    }
}
