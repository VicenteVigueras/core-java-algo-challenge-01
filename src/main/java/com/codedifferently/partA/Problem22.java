package com.codedifferently.partA;

public class Problem22 {

    public int intMax(int a, int b, int c) {
        int greaterNumber = Integer.max(a, b);
        int result = Integer.max(greaterNumber,c);
        return result;
    }
}
