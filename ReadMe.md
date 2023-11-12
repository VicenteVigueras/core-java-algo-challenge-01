# Part A

## Problem 01

# Challenge: Sleep In

## Instructions:

In this Java programming challenge, you are given two boolean parameters: `weekday` and `vacation`. The `weekday` parameter is `true` if it is a weekday, and the `vacation` parameter is `true` if you are on vacation. Your task is to write a Java method named `sleepIn` that determines whether or not you can sleep in. The sleep-in condition is met if it is not a weekday or you are on vacation.

### Java Method Signature:

```java
public boolean sleepIn(boolean weekday, boolean vacation) {
    // Your code goes here
}
```

### Examples:

- If `sleepIn(false, false)` is called, it should return `true` because it is not a weekday and you are not on vacation, so you can sleep in.
- If `sleepIn(true, false)` is called, it should return `false` because it is a weekday, and you cannot sleep in.
- If `sleepIn(false, true)` is called, it should return `true` because even though it is a weekday, you are on vacation, so you can sleep in.

Implement the `sleepIn` method in Java. Return the result of whether or not you can sleep in based on the given parameters using a `return` statement.

### Test Cases:

Implement the following test cases in your Java program to verify the functionality of your `sleepIn` method:

Test Case 1:

```java
System.out.println(sleepIn(false, false)); // Expected output: true
```

Explanation: It is not a weekday (false) and you are not on vacation (false), so you can sleep in.

Test Case 2:

```java
sleepIn(true, false); // Expected output: false
```

Explanation: It is a weekday (true), so you cannot sleep in.

Test Case 3:

```java
sleepIn(false, true); // Expected output: true
```

Explanation: Even though it is a weekday (false), you are on vacation (true), so you can sleep in.

Test Case 4:

```java
sleepIn(true, true); // Expected output: true
```

Explanation: It is a weekday (true), but you are on vacation (true), so you can sleep in.

Test Case 5:

```java
sleepIn(false, false); // Expected output: true
```

Explanation: It is not a weekday (false) and you are not on vacation (false), so you can sleep in.

Ensure your `sleepIn` method correctly handles these test cases.


## Problem02

# Challenge: Monkey Trouble

## Instructions:

You have two monkeys, monkey A and monkey B. For each monkey, you are provided with a boolean parameter in Java: `aSmile` for monkey A and `bSmile` for monkey B. Your task is to create a Java method named `monkeyTrouble`. This method will determine whether we are in trouble based on the smiling status of the monkeys.

The trouble condition is defined as follows: you are in trouble if both monkeys are smiling or if neither of them is smiling. To put it simply, if both monkey A and monkey B are either smiling or not smiling, it signifies trouble. The method should return `true` if we are in trouble, and `false` otherwise.

Define the `monkeyTrouble` method with the given signature and implement the logic as described.

Method Signature:

```java
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // your code here
}
```

## Examples:

- Calling `monkeyTrouble(true, true)` should return `true`, indicating trouble because both monkeys are smiling.
- Calling `monkeyTrouble(false, false)` should return `true`, indicating trouble because neither monkey is smiling.
- Calling `monkeyTrouble(true, false)` should return `false`, indicating no trouble since only one monkey is smiling.

Implement the `monkeyTrouble` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Here are some test cases you can use to validate your `monkeyTrouble` method:

1. `monkeyTrouble(true, true)` should return `true`. (Both monkeys are smiling, indicating trouble)
2. `monkeyTrouble(false, false)` should return `true`. (Neither monkey is smiling, indicating trouble)
3. `monkeyTrouble(true, false)` should return `false`. (Only one monkey is smiling, indicating no trouble)
4. `monkeyTrouble(false, true)` should return `false`. (Only one monkey is smiling, indicating no trouble)
5. `monkeyTrouble(true, true)` should return `true`. (Both monkeys are smiling, indicating trouble)

Ensure your `monkeyTrouble` method produces the expected results for these test cases.


## Problem03 

# Challenge: SumDouble

## Instructions:

You are provided with two integers, "a" and "b". Your task is to create a Java method named `sumDouble`. This method will calculate the sum of these two numbers. However, there's a special rule: if the two numbers are identical, you should double their sum before returning it.

Define the `sumDouble` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public int sumDouble(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `sumDouble(1, 2)` should return `3` because the sum of 1 and 2 is 3.
- Calling `sumDouble(3, 2)` should return `5` because the sum of 3 and 2 is 5.
- Calling `sumDouble(2, 2)` should return `8` because the sum of 2 and 2 is 4, and it is then doubled to 8.

Your implementation of the `sumDouble` method should follow these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Consider these test cases to validate your `sumDouble` method:

1. `sumDouble(1, 2)` should return `3`. (The sum of 1 and 2 is 3)
2. `sumDouble(3, 2)` should return `5`. (The sum of 3 and 2 is 5)
3. `sumDouble(2, 2)` should return `8`. (The sum of 2 and 2 is 4, doubled to 8)
4. `sumDouble(0, 0)` should return `0`. (The sum of 0 and 0 is 0; the numbers are the same, but doubling zero still results in zero)
5. `sumDouble(-1, -1)` should return `-4`. (The sum of -1 and -1 is -2, doubled to -4)

Ensure your `sumDouble` method generates the correct outputs for these test cases.


## Problem04

# Challenge: Diff21

## Instructions:

You are provided with an integer "n". Your task is to create a Java method named `diff21`. This method will calculate the absolute difference between "n" and 21, but with a twist:

- If "n" is less than 21, the method should return the absolute difference between "n" and 21.
- If "n" is greater than 21, the method should return double the absolute difference between "n" and 21.

Define the `diff21` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public int diff21(int n) {
    // your code here
}
```

## Examples:

- Calling `diff21(19)` should return `2`, as the absolute difference between 19 and 21 is 2.
- Calling `diff21(10)` should return `11`, as the absolute difference between 10 and 21 is 11.
- Calling `diff21(21)` should return `0`, since the number is already 21, making the difference 0.

Implement the `diff21` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Here are some test cases you can use to validate your `diff21` method:

1. `diff21(25)` should return `8`. (The absolute difference between 25 and 21 is 4, doubled to 8)
2. `diff21(30)` should return `18`. (The absolute difference between 30 and 21 is 9, doubled to 18)
3. `diff21(50)` should return `58`. (The absolute difference between 50 and 21 is 29, doubled to 58)
4. `diff21(21)` should return `0`. (The number is 21, so the difference is 0)
5. `diff21(15)` should return `6`. (The absolute difference between 15 and 21 is 6)

Make sure your `diff21` method produces the expected outputs for these test cases.


## Problem05

# Challenge: Parrot Trouble

## Instructions:

You are presented with a scenario involving a loudly talking parrot. There are two parameters: `talking` (a boolean) and `hour` (an integer representing the hour in 24-hour format, ranging from 0 to 23). Your task is to create a Java method named `parrotTrouble`. This method will determine if we are in trouble due to the parrot's talking.

We are in trouble if the parrot is talking and the hour is either before 7 AM or after 8 PM (inclusive). Specifically, if the parrot is talking (`talking` is true) and the hour is less than 7 or greater than 20, then we are in trouble. The method should return `true` if we are in trouble, and `false` otherwise.

Define the `parrotTrouble` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean parrotTrouble(boolean talking, int hour) {
    // your code here
}
```

## Examples:

- Calling `parrotTrouble(true, 6)` should return `true`, as the parrot is talking and the hour is before 7 AM.
- Calling `parrotTrouble(true, 7)` should return `false`, as the parrot is talking but the hour is not before 7 AM.
- Calling `parrotTrouble(false, 6)` should return `false`, as the parrot is not talking.

Implement the `parrotTrouble` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Consider these test cases to validate your `parrotTrouble` method:

1. `parrotTrouble(true, 21)` should return `true`. (The parrot is talking after 8 PM)
2. `parrotTrouble(true, 12)` should return `false`. (The parrot is talking, but it's not before 7 AM or after 8 PM)
3. `parrotTrouble(false, 22)` should return `false`. (The parrot is not talking)
4. `parrotTrouble(true, 3)` should return `true`. (The parrot is talking before 7 AM)
5. `parrotTrouble(false, 9)` should return `false`. (The parrot is not talking)

Ensure your `parrotTrouble` method produces the correct outputs for these test cases.

## Problem06

# Challenge: Makes10

## Instructions:

You are given two integers, "a" and "b". Your task is to create a Java method named `makes10`. This method will determine if either of the numbers is 10 or if their sum equals 10.

The method should return `true` in the following cases:
- If either "a" or "b" equals 10.
- If the sum of "a" and "b" equals 10.

In all other cases, the method should return `false`.

Define the `makes10` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean makes10(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `makes10(9, 10)` should return `true`, as one of the numbers is 10.
- Calling `makes10(9, 9)` should return `false`, as neither of the numbers is 10 and their sum is not 10.
- Calling `makes10(1, 9)` should return `true`, as their sum equals 10.

Implement the `makes10` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Consider these test cases to validate your `makes10` method:

1. `makes10(10, 5)` should return `true`. (One of the numbers is 10)
2. `makes10(3, 7)` should return `true`. (The sum of the numbers equals 10)
3. `makes10(6, 6)` should return `false`. (Neither of the numbers is 10, and their sum is not 10)
4. `makes10(8, 2)` should return `true`. (The sum of the numbers equals 10)
5. `makes10(11, -1)` should return `true`. (One of the numbers is 10)

Ensure your `makes10` method produces the correct outputs for these test cases.

## Problem07

# Challenge: NearHundred

## Instructions:

You are given an integer "n". Your task is to create a Java method named `nearHundred`. This method will determine if the number is within 10 units of either 100 or 200.

The method should return `true` if the number "n" is within 10 units (inclusive) of 100 or 200. Otherwise, it should return `false`.

In Java, you can calculate the absolute value of a number using the `Math.abs(num)` method.

Define the `nearHundred` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean nearHundred(int n) {
    // your code here
}
```

## Examples:

- Calling `nearHundred(93)` should return `true`, as 93 is within 10 units of 100.
- Calling `nearHundred(90)` should return `true`, as 90 is within 10 units of 100.
- Calling `nearHundred(89)` should return `false`, as 89 is not within 10 units of 100 or 200.

Implement the `nearHundred` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Consider these test cases to validate your `nearHundred` method:

1. `nearHundred(100)` should return `true`. (100 is exactly at 100)
2. `nearHundred(200)` should return `true`. (200 is exactly at 200)
3. `nearHundred(105)` should return `true`. (105 is within 10 units of 100)
4. `nearHundred(89)` should return `false`. (89 is not within 10 units of 100 or 200)
5. `nearHundred(190)` should return `true`. (190 is within 10 units of 200)

Ensure your `nearHundred` method produces the correct outputs for these test cases.

## Problem08

# Challenge: PosNeg

## Instructions:

You are provided with two integers, "a" and "b", and a boolean parameter called "negative". Your task is to create a Java method named `posNeg`. This method will determine if the two numbers meet specific conditions based on the value of "negative".

Here's how the method should behave:

- If "negative" is false, the method should return true if one of the numbers is positive and the other is negative. Specifically, if one number is greater than 0 and the other is less than 0, then the result should be true. However, if both numbers are either positive or both are negative, the result should be false.

- If "negative" is true, the method should return true only if both numbers are negative. That is, if both numbers are less than 0, then the result should be true. Otherwise, it should be false.

Define the `posNeg` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean posNeg(int a, int b, boolean negative) {
    // your code here
}
```

## Examples:

- Calling `posNeg(1, -1, false)` should return `true`, as one number is positive and the other is negative.
- Calling `posNeg(-1, 1, false)` should return `true`, as one number is negative and the other is positive.
- Calling `posNeg(-4, -5, true)` should return `true`, as both numbers are negative.

Implement the `posNeg` method according to these rules. Use the return statement in Java to return the result.

## Additional Test Cases:

Consider these test cases to validate your `posNeg` method:

1. `posNeg(2, -3, false)` should return `true`. (One number is positive, the other is negative)
2. `posNeg(-4, 0, false)` should return `false`. (Both numbers are not of opposite signs)
3. `posNeg(-6, -8, true)` should return `true`. (Both numbers are negative)
4. `posNeg(10, 5, true)` should return `false`. (Both numbers are positive)
5. `posNeg(0, -2, false)` should return `true`. (One number is neither positive nor negative, and the other is negative)

Ensure your `posNeg` method produces the correct outputs for these test cases.


## Problem09

# Challenge: NotString

## Instructions:

You are given a string. Your task is to create a Java method named `notString` that modifies the string according to specific rules.

The method should behave as follows:

- If the given string does not begin with the word "not", the method should return a new string where the word "not" has been prepended to the front. For instance, if the input string is "candy", the method should return "not candy".

- However, if the given string already begins with the word "not", the method should return the string unchanged. That is, if the string already starts with "not", return the original string as it is.

In Java, you can check if a string starts with a specific substring using the `startsWith` method.

Define the `notString` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String notString(String str) {
    // your code here
}
```

## Examples:

- Calling `notString("candy")` should return `"not candy"`, as the string does not start with "not", so "not" is added to the front.
- Calling `notString("x")` should return `"not x"`, as the string does not start with "not", so "not" is added to the front.
- Calling `notString("not bad")` should return `"not bad"`, as the string already starts with "not", so no modification is needed.

Implement the `notString` method according to these rules. Use the return statement in Java to return the modified string or the original string based on the conditions.

## Additional Test Cases:

Consider these test cases to validate your `notString` method:

1. `notString("programming")` should return `"not programming"`. (The string does not start with "not")
2. `notString("notepad")` should return `"notepad"`. (The string already starts with "not")
3. `notString("good")` should return `"not good"`. (The string does not start with "not")
4. `notString("not good")` should return `"not good"`. (The string already starts with "not")
5. `notString("")` should return `"not "`. (The string is empty, so "not" is added to the front)

Ensure your `notString` method produces the correct outputs for these test cases.

## Problem10

# Challenge: MissingChar

## Instructions:

You are provided with a non-empty string and an integer "n". Your task is to create a Java method named `missingChar`. This method will create a new string by removing the character at index "n" from the original string.

The value of "n" will always be a valid index within the original string, meaning "n" will be within the range of 0 to `str.length() - 1` (inclusive).

Define the `missingChar` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String missingChar(String str, int n) {
    // your code here
}
```

## Examples:

- Calling `missingChar("kitten", 1)` should return `"ktten"`, as the character at index 1 (the second character) is removed.
- Calling `missingChar("kitten", 0)` should return `"itten"`, as the character at index 0 (the first character) is removed.
- Calling `missingChar("kitten", 4)` should return `"kittn"`, as the character at index 4 (the fifth character) is removed.

Implement the `missingChar` method according to these rules. Use the return statement in Java to return the modified string where the character at index "n" has been removed.

## Additional Test Cases:

Consider these test cases to validate your `missingChar` method:

1. `missingChar("programming", 3)` should return `"programing"`. (The 'g' at index 3 is removed)
2. `missingChar("apple", 0)` should return `"pple"`. (The 'a' at index 0 is removed)
3. `missingChar("elephant", 6)` should return `"elephan"`. (The 't' at index 6 is removed)
4. `missingChar("hello", 4)` should return `"hell"`. (The 'o' at index 4 is removed)
5. `missingChar("goodbye", 2)` should return `"gobye"`. (The 'o' at index 2 is removed)

Ensure your `missingChar` method produces the correct outputs for these test cases.

## Problem11

# Challenge: FrontBack

## Instructions:

You are given a string. Your task is to create a Java method named `frontBack`. This method will create a new string by exchanging the first and last characters of the original string.

Specifically, the first character of the original string will become the last character in the new string, and the last character of the original string will become the first character in the new string.

Define the `frontBack` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String frontBack(String str) {
    // your code here
}
```

## Examples:

- Calling `frontBack("code")` should return `"eodc"`, as the first ('c') and last ('e') characters are exchanged.
- Calling `frontBack("a")` should return `"a"`, as the string contains only one character, so no exchange is needed.
- Calling `frontBack("ab")` should return `"ba"`, as the first ('a') and last ('b') characters are exchanged.

Implement the `frontBack` method according to these rules. Use the return statement in Java to return the modified string where the first and last characters have been exchanged.

## Additional Test Cases:

Consider these test cases to validate your `frontBack` method:

1. `frontBack("hello")` should return `"oellh"`. (The 'h' and 'o' are exchanged)
2. `frontBack("goodbye")` should return `"eoodbyg"`. (The 'g' and 'e' are exchanged)
3. `frontBack("programming")` should return `"gormmingp"`. (The 'p' and 'g' are exchanged)
4. `frontBack("cat")` should return `"tatc"`. (The 'c' and 't' are exchanged)
5. `frontBack("open")` should return `"npeo"`. (The 'o' and 'n' are exchanged)

Ensure your `frontBack` method produces the correct outputs for these test cases.

## Problem12

# Challenge: Front3

## Instructions:

You are given a string. Your task is to create a Java method named `front3`. This method will create a new string by repeating the front of the original string three times.

To determine the "front" of the string, consider the first three characters. If the string's length is less than 3, then the entire string becomes the "front".

Define the `front3` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String front3(String str) {
    // your code here
}
```

## Examples:

- Calling `front3("Java")` should return `"JavJavJav"` because the front ("Jav") is repeated three times.
- Calling `front3("Chocolate")` should return `"ChoChoCho"` because the front ("Cho") is repeated three times.
- Calling `front3("abc")` should return `"abcabcabc"` because the string length is less than 3, so the entire string is repeated three times.

Implement the `front3` method according to these rules. Use the return statement in Java to return the modified string where the front is repeated three times.

## Additional Test Cases:

Consider these test cases to validate your `front3` method:

1. `front3("Hi")` should return `"HiHiHi"`. (The front "Hi" is repeated three times)
2. `front3("Python")` should return `"PytPytPyt"`. (The front "Pyt" is repeated three times)
3. `front3("Elephant")` should return `"EleEleEle"`. (The front "Ele" is repeated three times)
4. `front3("a")` should return `"aaa"`. (The entire string "a" is repeated as it's less than 3 characters)
5. `front3("")` should return `""`. (An empty string repeated is still an empty string)

Ensure your `front3` method produces the correct outputs for these test cases.


## Problem13

# Challenge: BackAround

## Instructions:

You are given a string. Your task is to create a Java method named `backAround`. This method will create a new string by taking the last character of the original string and adding it to the front and back.

Specifically, you need to take the last character of the string and concatenate it with the original string itself, at both the beginning and the end.

Define the `backAround` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String backAround(String str) {
    // your code here
}
```

## Examples:

- Calling `backAround("cat")` should return `"tcatt"`, as the last character ('t') is added to the front and back of the original string.
- Calling `backAround("Hello")` should return `"oHelloo"`, as the last character ('o') is added to the front and back of the original string.
- Calling `backAround("a")` should return `"aaa"`, as the string contains only one character, and that character is added to the front and back.

Implement the `backAround` method according to these rules. Use the return statement in Java to return the modified string where the last character is added to the front and back.

## Additional Test Cases:

Consider these test cases to validate your `backAround` method:

1. `backAround("Programming")` should return `"gProgrammingg"`. (The last character 'g' is added to the front and back)
2. `backAround("Goodbye")` should return `"eGoodbyee"`. (The last character 'e' is added to the front and back)
3. `backAround("Z")` should return `"ZZ"`. (The single character 'Z' is added to the front and back)
4. `backAround("12345")` should return `"5123451"`. (The last character '5' is added to the front and back)
5. `backAround("")` should return `""`. (An empty string remains unchanged)

Ensure your `backAround` method produces the correct outputs for these test cases.


## Problem14

# Challenge: Front22

## Instructions:

You are given a string. Your task is to create a Java method named `front22`. This method will create a new string by taking the first two characters of the original string and adding them both at the front and back.

If the length of the string is less than 2, use whatever characters are there. In other words, if the string has only one character or is empty, the result will be the same as the original string, with those characters (or lack thereof) added at both the front and back.

Define the `front22` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String front22(String str) {
    // your code here
}
```

## Examples:

- Calling `front22("kitten")` should return `"kikittenki"` because the first two characters ("ki") are added to the front and back of the original string.
- Calling `front22("Ha")` should return `"HaHaHa"` because the string has only two characters, so those characters ("Ha") are added to the front and back.
- Calling `front22("abc")` should return `"ababcab"` because the first two characters ("ab") are added to the front and back.

Implement the `front22` method according to these rules. Use the return statement in Java to return the modified string where the first two characters are added to the front and back.

## Additional Test Cases:

Consider these test cases to validate your `front22` method:

1. `front22("coding")` should return `"cocodingco"`. (The first two characters "co" are added to the front and back)
2. `front22("H")` should return `"HHH"`. (The single character "H" is repeated three times)
3. `front22("Hi")` should return `"HiHiHi"`. (The two characters "Hi" are repeated three times)
4. `front22("hello")` should return `"hehellohe"`. (The first two characters "he" are added to the front and back)
5. `front22("")` should return `""`. (An empty string remains unchanged)

Ensure your `front22` method produces the correct outputs for these test cases.


## Problem15

# Challenge: Or35

## Instructions:

You are given a non-negative number. Your task is to create a Java method named `or35`. This method will determine if the number is a multiple of 3 or a multiple of 5.

To check if a number is a multiple of another number, you can use the modulo operator `%` in Java. The modulo operator returns the remainder when one number is divided by another. If the result of the modulo operation is 0, it means the number is divisible without any remainder, and thus it is a multiple of the divisor.

Define the `or35` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean or35(int n) {
    // your code here
}
```

## Examples:

- Calling `or35(3)` should return `true` because 3 is a multiple of 3.
- Calling `or35(10)` should return `true` because 10 is a multiple of 5.
- Calling `or35(8)` should return `false` because 8 is neither a multiple of 3 nor a multiple of 5.

Implement the `or35` method according to these rules. Use the return statement in Java to return `true` if the number is a multiple of 3 or 5, and `false` otherwise.

## Additional Test Cases:

Consider these test cases to validate your `or35` method:

1. `or35(15)` should return `true`. (15 is both a multiple of 3 and a multiple of 5)
2. `or35(14)` should return `false`. (14 is neither a multiple of 3 nor a multiple of 5)
3. `or35(20)` should return `true`. (20 is a multiple of 5)
4. `or35(9)` should return `true`. (9 is a multiple of 3)
5. `or35(7)` should return `false`. (7 is neither a multiple of 3 nor a multiple of 5)

Ensure your `or35` method produces the correct outputs for these test cases.

## Problem16


# Challenge: StartHi

## Instructions:

You are given a string. Your task is to create a Java method named `startHi`. This method will determine if the string starts with the characters "hi".

To check if a string starts with a specific substring, you should compare the first few characters of the string with that substring. In this case, you need to compare the first two characters of the string with the string "hi".

Define the `startHi` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean startHi(String str) {
    // your code here
}
```

## Examples:

- Calling `startHi("hi there")` should return `true` because the string starts with "hi".
- Calling `startHi("hi")` should return `true` because the string consists only of "hi".
- Calling `startHi("hello hi")` should return `false` because the string does not start with "hi".

Implement the `startHi` method according to these rules. Use the return statement in Java to return `true` if the string starts with "hi", and `false` otherwise.

## Additional Test Cases:

Consider these test cases to validate your `startHi` method:

1. `startHi("hi friends")` should return `true`. (The string starts with "hi")
2. `startHi("HI")` should return `false`. (The string does not start with "hi" due to case sensitivity)
3. `startHi("his")` should return `false`. (The string does not start with "hi" because it has additional characters after "hi")
4. `startHi("h")` should return `false`. (The string does not have enough characters to match "hi")
5. `startHi("Hi there")` should return `false`. (The string does not start with "hi" due to case sensitivity)

Ensure your `startHi` method produces the correct outputs for these test cases.


## Problem17

# Challenge: IcyHot

## Instructions:

You are given two temperatures. Your task is to create a Java method named `icyHot`. This method will determine if one temperature is less than 0 and the other temperature is greater than 100.

To solve this challenge, compare the given temperatures and check if one of them is less than 0 and the other is greater than 100.

Define the `icyHot` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean icyHot(int temp1, int temp2) {
    // your code here
}
```

## Examples:

- Calling `icyHot(120, -1)` should return `true` because one temperature (-1) is less than 0 and the other temperature (120) is greater than 100.
- Calling `icyHot(-1, 120)` should return `true` because one temperature (-1) is less than 0 and the other temperature (120) is greater than 100.
- Calling `icyHot(2, 120)` should return `false` because both temperatures are either less than 0 or not greater than 100.

Implement the `icyHot` method according to these rules. Use the return statement in Java to return `true` if one temperature is less than 0 and the other temperature is greater than 100, and `false` otherwise.

## Additional Test Cases:

Consider these test cases to validate your `icyHot` method:

1. `icyHot(-5, 105)` should return `true`. (One temperature is less than 0 and the other is greater than 100)
2. `icyHot(-2, 99)` should return `false`. (Both temperatures are either less than 0 or not greater than 100)
3. `icyHot(0, 101)` should return `false`. (Both temperatures are either less than 0 or not greater than 100)
4. `icyHot(50, -50)` should return `true`. (One temperature is less than 0 and the other is greater than 100)
5. `icyHot(0, 0)` should return `false`. (Both temperatures are either less than 0 or not greater than 100)

Ensure your `icyHot` method produces the correct outputs for these test cases.


## Problem18

# Challenge: LoneTeen

## Instructions:

You are given two integer values. Your task is to create a Java method named `loneTeen`. This method will determine if one of the numbers is a "teen" number (in the range of 13 to 19, inclusive) while the other is not.

To solve this challenge, check if one of the numbers is in the range of 13 to 19 (inclusive), while the other number is not. If this condition is met, the method should return `true`. However, if both numbers are in the teen range or both numbers are not in the teen range, the method should return `false`.

Define the `loneTeen` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean loneTeen(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `loneTeen(13, 99)` should return `true` because one number (13) is in the teen range, while the other number (99) is not.
- Calling `loneTeen(21, 19)` should return `true` because one number (19) is in the teen range, while the other number (21) is not.
- Calling `loneTeen(13, 13)` should return `false` because both numbers are in the teen range.

Implement the `loneTeen` method according to these rules. Use the return statement in Java to return `true` if one of the numbers is a teen while the other is not, and `false` otherwise.

## Additional Test Cases:

Consider these test cases to validate your `loneTeen` method:

1. `loneTeen(14, 16)` should return `true`. (One number is in the teen range, while the other is not)
2. `loneTeen(15, 18)` should return `false`. (Both numbers are in the teen range)
3. `loneTeen(20, 21)` should return `false`. (Both numbers are not in the teen range)
4. `loneTeen(13, 20)` should return `true`. (One number is in the teen range, while the other is not)
5. `loneTeen(17, 17)` should return `false`. (Both numbers are in the teen range)

Ensure your `loneTeen` method produces the correct outputs for these test cases.


## Problem19


# Challenge: DelDel

## Instructions:

You are given a string. Your task is to create a Java method named `delDel`. This method will check if the string contains the substring "del" starting at index 1. If it does, return a modified string where the "del" substring has been deleted. Otherwise, return the string unchanged.

To solve this challenge, examine the string to determine if the substring "del" starts at index 1. If it does, remove the "del" substring from the string and return the modified string. If not, return the original string without any changes.

Define the `delDel` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String delDel(String str) {
    // your code here
}
```

## Examples:

- Calling `delDel("adelbc")` should return `"abc"` because the string starts with "del" at index 1, so the "del" substring is deleted.
- Calling `delDel("adelHello")` should return `"aHello"` because the string starts with "del" at index 1, so the "del" substring is deleted.
- Calling `delDel("adedbc")` should return `"adedbc"` because the string does not start with "del" at index 1, so the string remains unchanged.

Implement the `delDel` method according to these rules. Use the return statement in Java to return the modified string without the "del" substring if it starts at index 1. Otherwise, return the original string as it is.

## Additional Test Cases:

Consider these test cases to validate your `delDel` method:

1. `delDel("adelicious")` should return `"adelicious"`. (The string does not start with "del" at index 1)
2. `delDel("adello")` should return `"alo"`. (The "del" substring is removed)
3. `delDel("abcdel")` should return `"abcdel"`. (The string does not start with "del" at index 1)
4. `delDel("delfood")` should return `"delfood"`. (The string does not start with "del" at index 1)
5. `delDel("delta")` should return `"delta"`. (The string does not start with "del" at index 1)

Ensure your `delDel` method produces the correct outputs for these test cases.

## Problem20

# Challenge: MixStart

## Instructions:

You are given a string. Your task is to create a Java method named `mixStart`. This method will check if the string begins with the substring "ix", where the first character can be any character.

To solve this challenge, examine the string to determine if the substring "ix" appears at the beginning of the string, following any first character. If the string starts with a character followed by "ix", return `true`. Otherwise, return `false`.

Define the `mixStart` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean mixStart(String str) {
    // your code here
}
```

## Examples:

- Calling `mixStart("mix snacks")` should return `true` because the string begins with "mix".
- Calling `mixStart("pix snacks")` should return `true` because the string begins with "pix", where 'p' replaces the first character.
- Calling `mixStart("piz snacks")` should return `false` because the string does not begin with a character followed by "ix".

Implement the `mixStart` method according to these rules. Use the return statement in Java to return `true` if the string starts with any character followed by "ix", and `false` otherwise.

## Additional Test Cases:

Consider these test cases to validate your `mixStart` method:

1. `mixStart("9ix snacks")` should return `true`. (The string begins with '9ix' where '9' replaces the first character)
2. `mixStart("hix snacks")` should return `true`. (The string begins with 'hix' where 'h' replaces the first character)
3. `mixStart("fix snacks")` should return `true`. (The string begins with 'fix' where 'f' replaces the first character)
4. `mixStart("nix snacks")` should return `true`. (The string begins with 'nix' where 'n' replaces the first character)
5. `mixStart("mixing snacks")` should return `true`. (The string begins with 'mix')

Ensure your `mixStart` method produces the correct outputs for these test cases.


## Problem21

# Challenge: StartOz

## Instructions:

You are given a string. Your task is to create a Java method named `startOz`. This method will create a new string using the first two characters of the original string, but with specific conditions: include the first character only if it is 'o', and include the second character only if it is 'z'.

To solve this challenge, examine the string and extract the first two characters. Include the first character in the new string if it is 'o'. Include the second character if it is 'z'. If these conditions are not met for each respective character, exclude them from the new string.

Define the `startOz` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String startOz(String str) {
    // your code here
}
```

## Examples:

- Calling `startOz("ozymandias")` should return `"oz"` because both the first character ('o') and the second character ('z') meet the conditions.
- Calling `startOz("bzoo")` should return `"z"` because the first character is not 'o', but the second character is 'z'.
- Calling `startOz("oxx")` should return `"o"` because the first character is 'o', but the second character is not 'z'.

Implement the `startOz` method according to these rules. Use the return statement in Java to return the new string that consists of the first two characters, following the given conditions.

## Additional Test Cases:

Consider these test cases to validate your `startOz` method:

1. `startOz("booz")` should return `""`. (Neither 'o' at the start nor 'z' as the second character)
2. `startOz("oz")` should return `"oz"`. (Both characters 'o' and 'z' are included)
3. `startOz("zzz")` should return `""`. (No 'o' at the start and 'z' is not the second character)
4. `startOz("ooz")` should return `"o"`. (First character 'o' is included, but the second character is not 'z')
5. `startOz("zo")` should return `"z"`. (Second character 'z' is included, but the first character is not 'o')

Ensure your `startOz` method produces the correct outputs for these test cases.

## Problem22

# Challenge: IntMax

## Instructions:

You are given three integer values: `a`, `b`, and `c`. Your task is to create a Java method named `intMax`. This method will determine the largest value among the three integers.

To solve this challenge, compare the three integers and find the maximum value. In other words, identify the number that is larger than both the other numbers.

Define the `intMax` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public int intMax(int a, int b, int c) {
    // your code here
}
```

## Examples:

- Calling `intMax(1, 2, 3)` should return `3` because 3 is the largest value among 1, 2, and 3.
- Calling `intMax(1, 3, 2)` should return `3` because 3 is the largest value among 1, 3, and 2.
- Calling `intMax(3, 2, 1)` should return `3` because 3 is the largest value among 3, 2, and 1.

Implement the `intMax` method according to these rules. Use the return statement in Java to return the largest value among the three integers.

## Additional Test Cases:

Consider these test cases to validate your `intMax` method:

1. `intMax(5, 10, 7)` should return `10`. (10 is the largest value among 5, 10, and 7)
2. `intMax(-1, -5, -3)` should return `-1`. (-1 is the largest value among -1, -5, and -3)
3. `intMax(0, 0, 0)` should return `0`. (0 is the largest value among 0, 0, and 0)
4. `intMax(100, 200, 150)` should return `200`. (200 is the largest value among 100, 200, and 150)
5. `intMax(-10, 0, 10)` should return `10`. (10 is the largest value among -10, 0, and 10)

Ensure your `intMax` method produces the correct outputs for these test cases.

## Problem23


# Challenge: Close10

## Instructions:

You are given two integer values: `a` and `b`. Your task is to create a Java method named `close10`. This method will determine which value is closer to 10 and return that value. In the event of a tie, return 0.

To solve this challenge, compare the absolute differences between 10 and the given integers, `a` and `b`. The number with the smaller absolute difference is closer to 10. If both absolute differences are the same, it's a tie, and you should return 0.

Define the `close10` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public int close10(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `close10(8, 13)` should return `8` because the absolute difference between 8 and 10 is smaller than the absolute difference between 13 and 10.
- Calling `close10(13, 8)` should return `8` because the absolute difference between 8 and 10 is smaller than the absolute difference between 13 and 10.
- Calling `close10(13, 7)` should return `0` because both absolute differences, 3 and 3, are the same, resulting in a tie.

Implement the `close10` method according to these rules. Use the return statement in Java to return the value that is closer to 10, or 0 if both values are equidistant from 10.

## Additional Test Cases:

Consider these test cases to validate your `close10` method:

1. `close10(5, 12)` should return `5`. (5 is closer to 10 than 12)
2. `close10(10, 20)` should return `10`. (10 is exactly 10, while 20 is farther)
3. `close10(0, 10)` should return `10`. (10 is exactly 10, while 0 is farther)
4. `close10(15, 8)` should return `8`. (8 is closer to 10 than 15)
5. `close10(11, 12)` should return `11`. (11 is closer to 10 than 12)

Ensure your `close10` method produces the correct outputs for these test cases.

## Problem24 

# Challenge: In3050

## Instructions:

You are given two integer values: `a` and `b`. Your task is to create a Java method named `in3050`. This method will check if both values are within a specific range and return `true` if both values are either in the range of 30 to 40 (inclusive) or in the range of 40 to 50 (inclusive). Otherwise, it should return `false`.

To solve this challenge, determine if both values are within the specified ranges. The ranges are inclusive, meaning that the boundary values are considered valid.

Define the `in3050` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean in3050(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `in3050(30, 31)` should return `true` because both values are within the range of 30 to 40 (inclusive).
- Calling `in3050(30, 41)` should return `false` because one value is within the range of 30 to 40 (inclusive), but the other value is not.
- Calling `in3050(40, 50)` should return `true` because both values are within the range of 40 to 50 (inclusive).

Implement the `in3050` method according to these rules. Use conditional statements to check if both values are within the specified ranges. Return `true` if both conditions are met; otherwise, return `false`.

## Additional Test Cases:

Consider these test cases to validate your `in3050` method:

1. `in3050(35, 45)` should return `true`. (Both values are within the range of 30 to 40)
2. `in3050(25, 35)` should return `false`. (One value is not within the range of 30 to 40)
3. `in3050(40, 55)` should return `false`. (One value is not within the range of 40 to 50)
4. `in3050(30, 50)` should return `false`. (Values are in different ranges)
5. `in3050(35, 55)` should return `false`. (One value is not within the range of 40 to 50)

Ensure your `in3050` method produces the correct outputs for these test cases.


## Problem25

# Challenge: Max1020

## Instructions:

You are given two positive integer values: `a` and `b`. Your task is to create a Java method named `max1020`. This method will determine the larger value between the two that falls within the range of 10 to 20 (inclusive). If neither value is within that range, return 0.

To solve this challenge, compare the values of `a` and `b` and determine which value is larger and within the range of 10 to 20 (inclusive). If both values are within the range, return the larger value. If only one value is within the range, return that value. If neither value is within the range, return 0.

Define the `max1020` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public int max1020(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `max1020(11, 19)` should return `19` because both values are within the range of 10 to 20 (inclusive), and 19 is the larger value.
- Calling `max1020(19, 11)` should return `19` because both values are within the range of 10 to 20 (inclusive), and 19 is the larger value.
- Calling `max1020(11, 9)` should return `11` because one value is within the range of 10 to 20 (inclusive), and 11 is the larger value.

Implement the `max1020` method according to these rules. Use conditional statements to check if each value is within the specified range. Compare the values and return the larger value if it falls within the range. If neither value is within the range, return 0.

## Additional Test Cases:

Consider these test cases to validate your `max1020` method:

1. `max1020(15, 25)` should return `15`. (Only 15 is within the range)
2. `max1020(9, 25)` should return `0`. (Neither value is within the range)
3. `max1020(21, 5)` should return `0`. (Neither value is within the range)
4. `max1020(17, 13)` should return `17`. (Both are within the range, but 17 is larger)
5. `max1020(10, 20)` should return `20`. (Both are within the range, but 20 is larger)

Ensure your `max1020` method produces the correct outputs for these test cases.


## Problem26

# Challenge: StringE

## Instructions:

You are given a string. Your task is to create a Java method named `stringE`. This method will check if the string contains between 1 and 3 occurrences of the letter 'e'. Return `true` if the string meets this condition; otherwise, return `false`.

To solve this challenge, count the number of occurrences of the letter 'e' in the given string and check if it falls within the range of 1 to 3 (inclusive). If the count is within this range, return `true`; otherwise, return `false`.

Define the `stringE` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean stringE(String str) {
    // your code here
}
```

## Examples:

- Calling `stringE("Hello")` should return `true` because there is one occurrence of the letter 'e' in the string.
- Calling `stringE("Heelle")` should return `true` because there are three occurrences of the letter 'e' in the string.
- Calling `stringE("Heelele")` should return `false` because there are four occurrences of the letter 'e' in the string.

Implement the `stringE` method according to these rules. Use a loop to count the occurrences of 'e' in the string. Then, check if the count is within the range of 1 to 3 (inclusive) and return `true` or `false` accordingly.

## Additional Test Cases:

Consider these test cases to validate your `stringE` method:

1. `stringE("elephant")` should return `true`. (Two occurrences of 'e')
2. `stringE("cat")` should return `false`. (No occurrence of 'e')
3. `stringE("developer")` should return `false`. (Four occurrences of 'e')
4. `stringE("e")` should return `true`. (One occurrence of 'e')
5. `stringE("Elephant")` should return `false`. (The uppercase 'E' is not counted)

Ensure your `stringE` method produces the correct outputs for these test cases.

## Problem27

# Challenge: LastDigit

## Instructions:

You are given two non-negative integer values: `a` and `b`. Your task is to create a Java method named `lastDigit`. This method will check if both values have the same last digit. Return `true` if they have the same last digit; otherwise, return `false`.

To solve this challenge, compare the last digits of the given values `a` and `b`. To extract the last digit of a number, use the modulo operator `%`, which returns the remainder of the division operation. If the last digits of both values are equal, return `true`; otherwise, return `false`.

Define the `lastDigit` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public boolean lastDigit(int a, int b) {
    // your code here
}
```

## Examples:

- Calling `lastDigit(7, 17)` should return `true` because both values end with the digit 7.
- Calling `lastDigit(6, 17)` should return `false` because the last digits of the two values are different.
- Calling `lastDigit(3, 113)` should return `true` because both values end with the digit 3.

Implement the `lastDigit` method according to these rules. Use the modulo operator `%` to extract the last digits of `a` and `b`. Compare the last digits and return `true` if they are equal; otherwise, return `false`.

## Additional Test Cases:

Consider these test cases to validate your `lastDigit` method:

1. `lastDigit(12, 22)` should return `true`. (Both values end with the digit 2)
2. `lastDigit(31, 92)` should return `false`. (Different last digits)
3. `lastDigit(50, 100)` should return `true`. (Both values end with the digit 0)
4. `lastDigit(99, 999)` should return `true`. (Both values end with the digit 9)
5. `lastDigit(123, 456)` should return `false`. (Different last digits)

Ensure your `lastDigit` method produces the correct outputs for these test cases.

## Problem 28

# Challenge: EndUp

## Instructions:

You are given a string. Your task is to create a Java method named `endUp`. This method will modify the string by converting the last three characters to uppercase. If the string has fewer than three characters, convert the existing characters to uppercase. Return the modified string.

To solve this challenge, manipulate the string to convert the last three characters to uppercase. Use the `toUpperCase()` method to convert a string or substring to uppercase. If the string has fewer than three characters, apply the conversion to the entire string.

Define the `endUp` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String endUp(String str) {
    // your code here
}
```

## Examples:

- Calling `endUp("Hello")` should return `"HeLLO"` because the last three characters "llo" have been converted to uppercase.
- Calling `endUp("hi there")` should return `"hi thERE"` because the last three characters "ere" have been converted to uppercase.
- Calling `endUp("hi")` should return `"HI"` because the string has fewer than three characters, so the entire string is converted to uppercase.

Implement the `endUp` method according to these rules. Use conditional statements to check the length of the string and determine the appropriate conversion. Apply `toUpperCase()` to the relevant part of the string.

## Additional Test Cases:

Consider these test cases to validate your `endUp` method:

1. `endUp("coding")` should return `"codING"`. (Last three characters converted to uppercase)
2. `endUp("OpenAI")` should return `"OpenAI"`. (Entire string converted as it's fewer than three characters)
3. `endUp("UPPER")` should return `"UPPER"`. (Entire string converted as it's fewer than three characters)
4. `endUp("a")` should return `"A"`. (Single character string converted to uppercase)
5. `endUp("Hi there!")` should return `"Hi there!"`. (String unchanged as last three characters are not within the last three positions)

Ensure your `endUp` method produces the correct outputs for these test cases.


## Problem29

# Challenge: EveryNth

## Instructions:

You are given a non-empty string and a positive integer `N`. Your task is to create a Java method named `everyNth`. This method will create a new string by selecting specific characters from the original string, determined by the value of `N`. Starting from the first character (index 0), include every `N`th character from the original string in the new string.

To solve this challenge, iterate over the characters of the original string and select only those characters at indexes that are multiples of `N`. For example, if `N` is 3, include characters at indexes 0, 3, 6, and so on. Build a new string by concatenating these selected characters.

Define the `everyNth` method in Java with the following signature and implement the logic as described.

Method Signature:

```java
public String everyNth(String str, int n) {
    // your code here
}
```

## Examples:

- Calling `everyNth("Miracle", 2)` should return `"Mrce"` because you select characters at indexes 0, 2, 4, and 6 from the original string.
- Calling `everyNth("abcdefg", 2)` should return `"aceg"` because you select characters at indexes 0, 2, 4, and 6 from the original string.
- Calling `everyNth("abcdefg", 3)` should return `"adg"` because you select characters at indexes 0, 3, and 6 from the original string.

Implement the `everyNth` method according to these rules. Use a loop or other iterative construct to iterate over the characters of the original string. Use conditional statements to select the characters that correspond to the multiples of `N`. Build the new string by concatenating these selected characters.

## Additional Test Cases:

Consider these test cases to validate your `everyNth` method:

1. `everyNth("Hello, world!", 5)` should return `"H,w"`. (Characters at indexes 0 and 5)
2. `everyNth("Programming", 3)` should return `"Pgmn"`. (Characters at indexes 0, 3, 6, and 9)
3. `everyNth("abcdefghij", 1)` should return `"abcdefghij"`. (Every character is selected)
4. `everyNth("1234567890", 4)` should return `"1470"`. (Characters at indexes 0, 4, 8)
5. `everyNth("abcdefg", 7)` should return `"a"`. (Only the first character is selected)

Ensure your `everyNth` method produces the correct outputs for these test cases.





