package com.codedifferently.partA;

public class Problem05 {
    public Boolean parrotTrouble(boolean talking, int hour) {
        if((hour < 7 || hour > 20) && talking) {
        return true;
        }
        return false;
    }
}
