package com.codedifferently.partA;

public class Problem21 {
    public String startOz(String str) {
        Character firsCharacter = str.charAt(0);
        Character secondCharacter = str.charAt(1);

        if(str.isEmpty()) {
            return "";
        }
        else if((firsCharacter == 'o') && (secondCharacter == 'z')) {
            return "oz";
        }
        else if(!(firsCharacter == 'o') && (secondCharacter == 'z')) {
            return "z";
        }
        else if((firsCharacter == 'o') && !(secondCharacter == 'z')) {
            return "o";
        }
        return "";
    }
}
