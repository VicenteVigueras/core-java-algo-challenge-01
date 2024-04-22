package com.codedifferently.partA;

public class Problem17 {
    public Boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 || temp1 < 0) && (temp2 > 100 || temp2 <0)) {
            if (!(temp1 < 0 && temp2 < 0)) {
                return true;
            }
        }
        return false;
    }
}
