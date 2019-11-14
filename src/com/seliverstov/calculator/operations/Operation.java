package com.seliverstov.calculator.operations;

import java.math.BigDecimal;

public interface Operation {
    Integer getPriority();

    default double result(double b, double a) {
        return 0;
    }
}
