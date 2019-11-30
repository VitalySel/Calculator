package com.seliverstov.calculator.builder;

import java.math.BigDecimal;

public class Number {
    private String number = "";

    public static class Biulder {
        private Number newNumber;

        public Biulder() {
            newNumber = new Number();
        }

        public Biulder withNumber(Character ch) {
            newNumber.number += ch;
            return this;
        }

        public BigDecimal build() {
            return BigDecimal.valueOf(Double.parseDouble(newNumber.number));
        }
    }
}
