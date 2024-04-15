package com.codedifferently.partA;

public class Problem01 {
    public Boolean sleepIn(boolean weekday, boolean vacation) {
       if(!weekday && !vacation) {
        return true;
       }
       else if(weekday && vacation) {
        return true;
       }
       else if(!weekday && vacation) {
        return true;
       }
       else return false;
    }
}
