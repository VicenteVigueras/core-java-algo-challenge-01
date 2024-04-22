package com.codedifferently.partA;

public class Problem19 {
    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();
        problem19.delDel("");
        // should print ice
    }

    public String delDel(String str) {
       if(str.isEmpty()) {
        return "";
       } 
       StringBuilder stringBuilder = new StringBuilder(str);
       String del = stringBuilder.substring(1, 4);
        if (del.contentEquals("del") == true) {
        return stringBuilder.delete(1,4).toString(); 
    }
       return str;

    }
}
