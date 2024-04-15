package com.codedifferently.partA;

public class Problem02 {
    public Boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        }
        return false;
    }
}
