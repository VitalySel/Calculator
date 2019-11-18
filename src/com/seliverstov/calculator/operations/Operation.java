package com.seliverstov.calculator.operations;

import java.math.BigDecimal;

public abstract class Operation {
    Integer priority;

    public Operation(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority(){
        return priority;
    };

   public BigDecimal result(BigDecimal b, BigDecimal a) {
        return null;
    }
}
