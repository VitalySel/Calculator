package com.seliverstov.calculator.operations;

public class RightBracket extends Operation {

    public RightBracket(Integer priority) {
        super(priority);
    }

    @Override
    public Integer getPriority() {
        return priority;
    }
}
