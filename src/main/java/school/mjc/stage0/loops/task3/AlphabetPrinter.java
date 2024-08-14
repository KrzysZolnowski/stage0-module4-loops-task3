package school.mjc.stage0.loops.task3;

import java.sql.Array;

public class AlphabetPrinter {
    public void printAlphabet() {
        char[] englishAlphabet = new char[26];

        for (int i = 0; i < englishAlphabet.length; i++) {
            englishAlphabet[i] = (char) ('a' + i);
        }
        for (char letter : englishAlphabet)
            System.out.println(letter + "");
    }
}

