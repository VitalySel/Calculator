package com.seliverstov.calculator.operations;

import java.math.BigDecimal;

public abstract class Operation {

    Integer priority;

    public Operation(Integer priority) {
        this.priority = priority;
    }

    public Operation() {
    }

    public abstract Integer getPriority();

    public BigDecimal result(BigDecimal b, BigDecimal a) {
        return null;
    }

    public abstract Operation copy();

}
