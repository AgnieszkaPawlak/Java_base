package unit5.loop;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LoopExercises {
    public static void main(String[] args) {
        //Exercise 1
        //Option 1
        /*int num = 50;
        do{
            System.out.print(num + ",");
            num++;
        } while (num > 50 && num <= 147);*/
        //Option 2
        /*for( int i = 50; i <= 147; i++) {
            System.out.println(i);
        }*/

        //Exercise 2
        /*Write a program which prints number from 1 to 60. After every fourth number, print "Pick"*/
        //Option1
        /*for( int i = 1; i <=60; i++) {
            if(i % 4 == 0) {
                System.out.println("Pick");
            }
            System.out.println(i);
        }*/
        //Option2
        /*int count = 0;
        for( int i = 1; i <=60; i++) {
            if(count == 3) {
                System.out.println("Pick");
                count = 0;
            }
            System.out.println(i);
            count++;
        }*/

        //Exercise 3
        /* Write a program which ask user about password. Make the password "mig30mag". Each time the user enters the password incorrectly, prompt them for the password again. When the user enter password correctly, print "Correct "*/
        /*String correctPassword = "mig30mag";
        Scanner scanner = new Scanner(System.in);
        String userPassword;
            do {
                System.out.println("Please enter password");
                userPassword = scanner.next();
            } while (!userPassword.equals(correctPassword));
       System.out.println("Correct");*/

        //Exercise 4
        /*Write a game where the program picks a random number from 1 to 200 and the player has to guess it. Each time the player makes a guess, print
        * "higher" if the guess was too low or "lower" if the guess was too high. If the players correctly guess, print "correct", then end the game
        *  */
        /*Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(0,201);
        System.out.println(randomNumber);
        System.out.println("Please enter number");
        int userNumber;

        do {
            userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Higher");
            }
            else if (userNumber > randomNumber) {
                System.out.println("Lower");
            }
            else {
                System.out.println("Correct");
            }
        } while (userNumber != randomNumber);*/

        //Exercise 5
        /*Add information to the above game, how many guesses were*/
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(0,201);
        System.out.println(randomNumber);
        System.out.println("Please enter number");
        int userNumber;
        int count = 0;

        do {
            userNumber = scanner.nextInt();
            count++;
            if (userNumber < randomNumber) {
                System.out.println("Higher");
            }
            else if (userNumber > randomNumber) {
                System.out.println("Lower");

            }
            else {
                System.out.println("Correct");
                System.out.println("You guess in " + count + " times.");
            }
        } while (userNumber != randomNumber);




















        //Exercise 5
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 200);
//        int guess;
//        System.out.println("---Guess Number from 0 to 100---");
//        do {
//            System.out.println("\nGuess:");
//            guess = scanner.nextInt();
//
//            if ( randomNumber > guess) {
//                System.out.println("Higher");
//            }
//            else if ( randomNumber < guess) {
//                System.out.println("Lower");
//            }
//            else {
//                System.out.println("CORRECT. My number was " + randomNumber + ".");
//            }
//        } while (guess != randomNumber);

        //Exercise 6
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
//        int guess;
//        System.out.println("---Guess My Number Game---");
//        int count = 0;
//        do {
//            System.out.println("\nGuess:");
//            guess = scanner.nextInt();
//            count++;
//
//            if ( randomNumber > guess) {
//                System.out.println("Higher");
//            }
//            else if ( randomNumber < guess) {
//                System.out.println("Lower");
//            }
//            else {
//                System.out.println("CORRECT. My number was " + randomNumber + "." + "You Guess in " + count);
//            }
//        } while (guess != randomNumber);
    }
}
