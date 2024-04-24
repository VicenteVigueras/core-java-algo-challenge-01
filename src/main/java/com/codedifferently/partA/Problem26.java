package com.codedifferently.partA;

public class Problem26 {

    public Boolean stringE(String str) {
     int base = 0;
      for(int i=0; i < str.length(); i++) {
      if(str.charAt(i) == 'e') {
        base = base + 1;
      }
     }
     if(base <= 3 && base >= 1) {
        return true;
     }
     return false;
    }
}
