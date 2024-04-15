package com.codedifferently.partA;

public class Problem07 {
    public Boolean nearHundred(int n) {
       if((n >= 90) && (n <= 110) || (n >= 190) && (n <= 210)) {
        return true;
       }
        return false;
    }
}
