package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double number1 = 2;
        double number2 = 33;
        Operator operator = Operator.fromChart('+');
        MathUtils mathUtils = new MathUtils();
        double sum =
        mathUtils.printResult(number1, number2, operator);
        System.out.println(sum);

        MathOperations operations = new MathOperations();
        operations.useOperators();

        NumericPromotion numericPromotion = new NumericPromotion();
        numericPromotion.convertTypeOfResult();

        List list = new ArrayList<>(List.of("green", "blue","pink"));
        PrintLastColor printLastColor = new PrintLastColor();
        printLastColor.printLastColor(2,  list);

        DivideNumberByConditions divideNumberByConditions = new DivideNumberByConditions();
        divideNumberByConditions.checkNumber(2,2,1);

    }
}