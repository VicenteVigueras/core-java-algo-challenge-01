package com.codedifferently.partA;

public class Problem13 {
    public String backAround(String str) {
        // your code here
        if (str.isEmpty()) {
            return str;
        }
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }

}
