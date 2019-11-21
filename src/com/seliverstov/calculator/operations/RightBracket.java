package com.seliverstov.calculator.operations;

public class RightBracket extends Operation {
    //static final  Integer PRIORITY = 1;

    public RightBracket(Integer priority) {
        super(priority);
    }

    private RightBracket(RightBracket other) {
        super();
        this.priority = other.priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public Operation copy() {
        return new RightBracket(this);
    }
}
