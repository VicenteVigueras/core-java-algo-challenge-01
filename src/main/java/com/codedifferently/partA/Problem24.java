package com.codedifferently.partA;

public class Problem24 {
    public Boolean in3050(int a, int b) {
        if((a >= 30 && a <=40) && (b<=40 && b>=30)) {
            return true;
        }
        else if((a >= 40 && a <=50) && (b<=50 && b>=40)) {
            return true;
        }
        return false;
    }
}
