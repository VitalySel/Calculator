package com.seliverstov.calculator.operations;

public class LeftBracket implements Operation {

    private Integer priority;

    public LeftBracket(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }
}
