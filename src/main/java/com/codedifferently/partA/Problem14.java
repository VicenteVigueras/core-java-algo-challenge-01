package com.codedifferently.partA;

public class Problem14 {
    public String front22(String str) {
        if(!str.isEmpty() && (str.length() > 2)) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String front22 = stringBuilder.substring(0, 2);
        String result = front22 + str + front22;
        return result;
    }
    else if (!str.isEmpty()) {
        return str + str + str;
    }
    return "";
}
}