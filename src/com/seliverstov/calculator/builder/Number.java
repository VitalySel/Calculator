package com.seliverstov.calculator.builder;

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

        public String build() {
            return newNumber.number;
        }

      /*  public String readNumber(Character ch) {
            return "" + ch;
        }*/
    }
}
