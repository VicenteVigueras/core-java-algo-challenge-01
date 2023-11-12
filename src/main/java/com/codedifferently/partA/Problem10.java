package com.codedifferently.partA;

public class Problem10 {

    public String missingChar(String str, int n) {
        // your code here
        return str.substring(0, n) + str.substring(n + 1);
    }
}
