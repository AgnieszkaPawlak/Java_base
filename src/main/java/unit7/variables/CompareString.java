package org.example;

public class CompareString {
    public boolean isTheSameWord(String element1, String element2) {
        if (element1 == null || element2 == null) return false;
        return element1.trim().equalsIgnoreCase(element2.trim());
    }
}
