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

