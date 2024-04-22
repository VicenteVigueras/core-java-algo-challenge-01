package com.codedifferently.partA;

public class Problem11 {
 public String frontBack(String str) {
      StringBuilder stringBuilder = new StringBuilder(str);
      Character lastLetter = str.charAt(str.length()-1);
      Character firstLetter = str.charAt(0);
      stringBuilder.setCharAt(0,lastLetter);
      stringBuilder.setCharAt(str.length()-1,firstLetter);
      String result = stringBuilder.toString();
      return result;
    }
}


