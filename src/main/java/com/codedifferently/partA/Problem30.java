package com.codedifferently.partA;

import java.util.ArrayList;
import java.util.List;

public class Problem30 {
    public static void main(String args[]) {
        String input = "Vicente";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
        Problem30 problem30 = new Problem30();
        problem30.reverseTheString("Vicente");
    }
    
    public String reverseTheString(String str) {
    List<Character> list = new ArrayList<Character>();
        for(int i = (str.length() -1); i >= 0; i--) {
            char index = str.charAt(i);
            list.add(index);
        }
    System.out.println(list);
      return "success";
        }
}