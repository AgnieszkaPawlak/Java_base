package unit4.conditional;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ConditionalExercises {
    public static void main(String[] args) {

        // Exercise 1
        /* Write a program with 2 variables and give each one a value. Depending on value print:
        "a is bigger than b by x"
        "a is smaller than b by x"
        " a and b are the same"
         */
        /*int a = 33;
        int b = 33;

        if ( a > b) {
            System.out.println("A is bigger than b by " + (a - b) );
        }
        else if ( a < b) {
            System.out.println("A is smaller than b by " + + (b - a) );
        }
        else {
            System.out.println("A and b are the same." );
        }*/

        //Exercise 2
        /*Create a game where the program picks a random number from 1 to 7, and player has to guess it. The player has 2 chances.*/
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 8);
        System.out.println("Please enter your lucky number: ");
        int userNumber = scanner.nextInt();

        if ( randomNumber == userNumber) {
            System.out.println("Corrct! You are lucky.");
        } else {

                System.out.println("Wrong");
                System.out.println("Please enter your lucky number: ");
                userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Correct! You are lucky.");
            }
            else {
                System.out.println("Hard luck! Maybe next time.");
            }
        }
    }
}

