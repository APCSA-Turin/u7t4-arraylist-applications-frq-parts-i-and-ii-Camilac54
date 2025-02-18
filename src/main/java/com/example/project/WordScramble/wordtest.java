package com.example.project.WordScramble;

import java.util.ArrayList;
import java.util.Arrays;

public class wordtest {
    public static void main(String[] args) {
        // String result1 = WordScramble.scrambleWord("TAN");
        // System.out.println(result1);
        // System.out.println("TNA");

        // System.out.println("------");

        // String result2 = WordScramble.scrambleWord("ABRACADABRA");
        // System.out.println(result2);
        // System.out.println("BARCADABARA");

        // System.out.println("------");

        // String result3 = WordScramble.scrambleWord("WHOA");
        // System.out.println(result3);
        // System.out.println("WHOA");
        
        // System.out.println("------");

        // String result4 = WordScramble.scrambleWord("AARDVARK");
        // System.out.println(result4);
        // System.out.println("ARADVRAK");

        // System.out.println("------");

        // String result5 = WordScramble.scrambleWord("EGGS");
        // System.out.println(result5);
        // System.out.println("EGGS");

        // System.out.println("------");


        // String result6 = WordScramble.scrambleWord("A");
        // System.out.println(result6);
        // System.out.println("A");

        // System.out.println("------");

        // String result7 = WordScramble.scrambleWord("");
        // System.out.println(result7);
        // System.out.println("");

        // System.out.println("------");
        ArrayList<String> testWordList = new ArrayList<String>(Arrays.asList("TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"));
        testWordList = WordScramble.scrambleOrRemove(testWordList);
        ArrayList<String> expectedAfterScrambleRemove = new ArrayList<String>(Arrays.asList("TNA", "BARCADABARA", "PAPLE"));
        System.out.println(testWordList);
        System.out.println(expectedAfterScrambleRemove);
    }
}