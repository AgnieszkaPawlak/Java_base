package org.example;
import java.util.List;

public class PrintLastColor {

    void printLastColor(int totalColors, List<String> list) {

        int index = (totalColors -1) % list.size();
        String result  = list.get(index);
        System.out.println(result);

    }
}
