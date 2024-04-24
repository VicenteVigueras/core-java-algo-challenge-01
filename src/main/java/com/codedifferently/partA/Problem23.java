package com.codedifferently.partA;

public class Problem23 {

    public int close10(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if((a==0 && b ==10) || (a==10 && b==0)) {
            return 10;
        }
        int difference1 = a - 10;
        int difference2 = b - 10;
        int result = Integer.min(difference1, difference2);
        if(result == difference1) {
            return a;
        }
        return b;
    }
}
