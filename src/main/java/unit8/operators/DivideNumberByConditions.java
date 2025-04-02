package org.example;

public class DivideNumberByConditions {

    void checkNumber(int number, int firstCondition, int secondCondition) {
        if (firstCondition == 0 || secondCondition == 0) {
            System.out.println("Given condition can't be 0, please change the condition");
            return;
        }
        if (number %  firstCondition == 0 & number % secondCondition == 0) {
            System.out.println("Number is divisible by " + firstCondition + secondCondition);
        }
        else if (number % firstCondition  == 0) {
            System.out.println("Number is divisible by " + firstCondition);
        }
        else if ( number %  secondCondition == 0) {
            System.out.println("Number is divisible by" + secondCondition);
        } else {
            System.out.println("Sorry given number is not divisible by the conditions");
        }
    }
}
