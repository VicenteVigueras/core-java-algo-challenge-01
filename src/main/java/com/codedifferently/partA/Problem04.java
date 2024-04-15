package com.codedifferently.partA;

public class Problem04 {

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return 2 * (-1 * (21 - n));
        }
    }
}
