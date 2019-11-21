package com.seliverstov.calculator.operations;

public class LeftBracket extends Operation {
    //static final  Integer PRIORITY = 1;

    public LeftBracket(Integer priority) {
        super(priority);
    }
    private LeftBracket(LeftBracket other) {
        super();
        this.priority = other.priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public Operation copy() {
        return new LeftBracket(this);
    }
}
