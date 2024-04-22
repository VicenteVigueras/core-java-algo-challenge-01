package com.codedifferently.partA;

public class Problem12 {
    public String front3(String str) {
        
        if (str.length() > 3) {
        String substring = str.substring(0, 3);
        String front3 = (substring  + substring + substring);
        return front3;
        }
        return str + str + str;
    }

}
