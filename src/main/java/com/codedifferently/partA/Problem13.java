package com.codedifferently.partA;

public class Problem13 {
 
    public String backAround(String str) {
        if (!str.isEmpty()) {
        StringBuilder stringBuilder = new StringBuilder(str);
        Character lastLetter = stringBuilder.charAt(str.length()-1);
        lastLetter.toString();
        String result = lastLetter + str + lastLetter;
        System.out.println(result);
        return result;
        }
        return "";
    }

}
