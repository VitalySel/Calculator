package com.seliverstov.calculator.operations;

public class Division implements Operation {
    @Override
    public double result(double b, double a) {
      if (a == 0) {
          throw new IllegalArgumentException("Argument 'a' is 0");
      }
      return b/a;
    }
}
