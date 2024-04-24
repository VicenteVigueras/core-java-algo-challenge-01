package com.codedifferently.partA;

public class Problem25 {
    public int max1020(int a, int b) {
        if((a<=20 && 10<=a) && (b<=20 && 10<=b)) {
            return Integer.max(a, b);
        }
    else if((a<=20 && 10<=a) && !(b<=20 && 10<=b)) {
        return a;
    }
    else if(!(a<=20 && 10<=a) && (b<=20 && 10<=b)) {
        return b;
    }
    return 0;
    }


}
