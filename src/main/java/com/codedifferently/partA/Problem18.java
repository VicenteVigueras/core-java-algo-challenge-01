package com.codedifferently.partA;

public class Problem18 {
    public Boolean loneTeen(int a, int b) {
        if((a >= 13 && a <= 19) || !(b >= 13 && b <= 19) || !(a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            if(!(a > 19 && b > 19)) {
                return true;
            }
         }
        return false;
    }
}



