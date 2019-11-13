package com.seliverstov.calculator.operations;

public interface Operation {
    Integer getPriority();

    default double result(double b, double a) {
        return 0;
    }
}
