package com.codedifferently.partA;

public class Problem08 {
    public Boolean posNeg(int a, int b, boolean negative) {
        if((a <= 0 && b <= 0) && negative) {
            return true;
        }
        return !negative;
    }
}

        