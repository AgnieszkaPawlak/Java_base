package org.example;

public class JoinedString {
    void joinString(String element1, String element2) {
        String result = String.join(" ",element1, element2);
        System.out.println(result);
    }
    void JoinWithBuilder(String element1, String element2 ) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(element1)
                .append(element2);

        System.out.println(stringBuilder);
    }
}
