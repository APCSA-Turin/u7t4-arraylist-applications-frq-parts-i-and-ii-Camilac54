package com.example.project.Delimiter;


import java.util.ArrayList;
import java.util.Arrays;




public class testDeli {
    public static void main(String[] args) {
        Delimiters delimitersEx3 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList1 = delimitersEx3.getDelimitersList(tokens3);
        boolean res1 = delimitersEx3.isBalanced(delList1);
        System.out.println(delList1);
        System.out.println(res1);

        System.out.println("__________");

        String[] tokens4 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> delList2 = delimitersEx3.getDelimitersList(tokens4);
        boolean res2 = delimitersEx3.isBalanced(delList2);
        System.out.println(delList2);
        System.out.println(res2);

        System.out.println("__________");

        String[] tokens5 = {"</sup>"};
        ArrayList<String> delList3 = delimitersEx3.getDelimitersList(tokens5);
        boolean res3 = delimitersEx3.isBalanced(delList3);
        System.out.println(delList3);
        System.out.println(res3);

        System.out.println("__________");

        String[] tokens6 = {"<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList4 = delimitersEx3.getDelimitersList(tokens6);
        boolean res4 = delimitersEx3.isBalanced(delList4);
        System.out.println(delList4);
        System.out.println(res4);
    }
}