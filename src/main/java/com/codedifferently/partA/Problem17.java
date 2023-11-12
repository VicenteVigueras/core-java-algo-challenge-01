package com.codedifferently.partA;

public class Problem17 {
    public Boolean icyHot(int temp1, int temp2) {
        // your code here
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);

    }

}
