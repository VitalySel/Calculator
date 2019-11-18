package com.seliverstov.calculator.operations;

public class LeftBracket extends Operation {

    public LeftBracket(Integer priority) {
        super(priority);
    }

    @Override
    public Integer getPriority() {
        return priority;
    }
}
