package com.codedifferently.partA;

public class Problem10 {    
    public String missingChar(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.deleteCharAt(n);
        String result = stringBuilder.toString();
       return result;
    }
}