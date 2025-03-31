package org.example;

public class MathUtils {
   double printResult(double number1, double number2, Operator operator) {
        return switch (operator) {
            case ADD -> number1 + number2;
            case SUBTRACT -> number1 - number2;
            case MULTIPLY -> number1 * number2;
            case DIVIDE -> {
                if (number2 == 0.0) throw new ArithmeticException("Dzielenie przez zero!");
                yield number1 / number2;
            }

        };
    }
}
