package org.example;

public class WordChecker {

    void checkWord(String sentence, String word) {
        if (sentence.contains(word)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
