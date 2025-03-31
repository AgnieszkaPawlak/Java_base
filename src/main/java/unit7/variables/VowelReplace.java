package org.example;

public class VowelReplace {
    public void replaceVowels( String input, double number) {
        String numberAsString = String.valueOf(number);
        String result = input.replaceAll("(?i)[aeio]",numberAsString);
        System.out.println(result);
    }
}
