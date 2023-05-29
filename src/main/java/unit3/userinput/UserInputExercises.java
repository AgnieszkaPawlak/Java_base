package unit3.userinput;

import java.util.Scanner;

public class UserInputExercises {
    public static void main(String[] args) {
        //Exercise 1
        /* It Prints "You are x years. In x years you'll be 2x years old." Declare your age as variable which x is your age.*/
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(name + " "+"you are " + age + " years. In " + age + " "+ "years you'll be " + age * 2 + " "+"years old.");*/

        //Exercise 2
        /*Write a program that divides a total amount of a restaurant bill by the numbers of guests.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a total amount to be paid:");
        double total = scanner.nextDouble();
        System.out.println("Please enter a num of guests:");
        int numGuests = scanner.nextInt();
        double amountPerPerson = total / numGuests;
        System.out.println("Each person should paid" + " " + amountPerPerson);
    }
}
