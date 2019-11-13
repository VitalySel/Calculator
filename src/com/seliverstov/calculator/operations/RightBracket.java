package com.seliverstov.calculator.operations;

public class RightBracket implements Operation {

    private Integer priority;

    public RightBracket(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }
}
