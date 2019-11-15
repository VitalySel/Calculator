package com.seliverstov.calculator.operations;

import java.math.BigDecimal;

public interface Operation {
    Integer getPriority();

    default BigDecimal result(BigDecimal b, BigDecimal a) {
        return null;
    }
}
