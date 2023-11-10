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