package unit6.arrays;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {

        //Exercise 1
        /*Create a String array of 5 elements. Print out array using loop */
        //Option 1
        /*String[] animals = new  String[] {"Cat", "Dog", "Pig", "Snake", "Lion"};

        for( String animal: animals) {
            System.out.println(animal);
        }*/

        //Option 2
        /*String[] animals = new String[5];
        animals[0] = "Cat";
        animals[1] = "Dog";
        animals[2] = "Pig";
        animals[3] = "Snake";
        animals[4] = "Lion";

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }*/

        //Exercise 2
        /*Use a loop to populate an array with integers from 1 to 15. Use another loop to print the contents of the array  backwards*/

        /*int[] nums = new int[10];

        for(int  i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        for (int i = nums.length -1; i >  0; i--) {
                System.out.println(nums[i]);
        }*/

        //Exercise 3
        /*Create an array of five doubles and give each element some value. Calculate the sum of all the elements and print the result.
        * Calculate the mean/average of the all the elements and print that too*/
        //Option 1
        /* Scanner scanner = new Scanner(System.in);

        double[] nums = new double[5];
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter number:");
            nums[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num: nums) {
            sum = sum + num;
        }
        System.out.println(sum);
        double average = sum/nums.length ;
        System.out.println(average);*/

        //Option 2
        /*double[] nums = new double[5];
        nums[0] = 2.2;
        nums[1] = 26.2;
        nums[2] = 21.2;
        nums[3] = 27.2;
        nums[4] = 5.2;

        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        double average = sum / nums.length;
        System.out.println("Sum: " + sum + "Average: " + average);*/

        //Exercise 4
        /*Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        * However, create the array, so it can only hold a maximum of three strings. After the user enters the third item, print "No more memory avilable."
        * then print out the contents of the array*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter top five dishes");

        String[] dishes = new String[3];

        for (int i = 0; i < dishes.length; i++) {
            dishes[i] = scanner.nextLine();
        }
        System.out.println("Too more dishes\n");

        System.out.println("Favourite dishes: ");
        for(String dish: dishes) {
            System.out.println(dish);
        }
    }
}
