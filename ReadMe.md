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




