Question:1 What are the conditional operators in java?
Answer:In Java, the conditional operators are used to make decisions based on the values of variables or expressions. There are three conditional operators in Java:

i)If: The if operator is used to execute a block of code if a certain condition is true. 
ii)If-Else: The if-else operator is used to execute a block of code if a certain condition is true, and another block of code if the condition is false.
iii)Ternary: The ternary operator (also known as the conditional operator) is a shorthand way of writing an if-else statement. The ternary operator returns a value based on the result of a condition.
The ternary operator can be used to assign a value to a variable based on the result of a condition.


Question:2 What are the types of operators based on the number of operands?
Answer:
Based on the number of operands, operators can be classified into two types in Java:

i)Unary Operators: Unary operators are operators that operate on a single operand. For example, the unary minus operator (-) negates a value, the increment operator (++) increases a value by 1, and the decrement operator (--) decreases a value by 1.

ii)Binary Operators: Binary operators are operators that operate on two operands. For example, the addition operator (+) adds two values, the subtraction operator (-) subtracts one value from another, the multiplication operator (*) multiplies two values, and the division operator (/) divides one value by another.

It's important to note that some operators can have both unary and binary forms, for example, the plus operator (+) can be used as a binary operator to add two values, or as a unary operator to indicate a positive value.

Question:3 What is the use of Switch case in java programming?
Answer: 
The switch case statement in Java is used to perform different actions based on different conditions. It provides an alternative to using multiple if and else statements. The switch statement evaluates an expression, and matches the result to one of several possible cases. If a match is found, the corresponding code block is executed. If no match is found, an optional default case can be executed.

The syntax of a switch statement in Java is as follows:
switch (expression) {
  case value1:
    // code to be executed if expression == value1
    break;
  case value2:
    // code to be executed if expression == value2
    break;
  ...
  default:
    // code to be executed if no match is found
}

The expression in the switch statement is usually an integer or a String, but it can also be any type that can be implicitly converted to an integer or a String, such as a char, an enum, or a Byte, Short, Integer, or Character object.

The break statement is used to exit the switch statement and continue with the next statement after the switch statement. If a break statement is not present, execution will continue with the next case. This can be useful for cases where you want to perform multiple actions for a single case.

The switch case statement provides a more concise and readable way of implementing multiple conditional branches compared to using multiple if and else statements.


Question:4 What are the priority levels of arithmetic operation in java?
Answer:
The priority levels of arithmetic operations in Java determine the order in which operations are performed in an expression. Higher priority operations are performed before lower priority operations. The priority levels of arithmetic operations in Java, from highest to lowest, are:

Parentheses: Expressions inside parentheses are evaluated first.

Unary operators: The unary minus operator (-) and the unary plus operator (+) are evaluated next.

Multiplication, division, and modulo: The multiplication operator (*), the division operator (/), and the modulo operator (%) are evaluated next.

Addition and subtraction: The addition operator (+) and the subtraction operator (-) are evaluated last.

It's important to use parentheses to group operations and control the order of evaluation, when necessary. For example, if you want to perform addition before multiplication, you should use parentheses to group the addition operation.

Example:
int x = 3 + 4 * 5;   // x is equal to 23
int y = (3 + 4) * 5; // y is equal to 35

In this example, the expression 3 + 4 * 5 is evaluated as 3 + (4 * 5) because multiplication has higher priority than addition. The expression (3 + 4) * 5 is evaluated as (3 + 4) * 5 because the parentheses group the addition operation and ensure that it is performed first.


Question:5 What are the conditional statements and use of conditional statements in java?
Answer:
Conditional statements in Java are used to execute code only when a certain condition is met. There are three types of conditional statements in Java:
i)If statement: The if statement allows you to execute a block of code if a specified condition is true. 
ii)If-else statement: The if-else statement allows you to execute a block of code if a specified condition is true, and another block of code if the condition is false.
iii)Switch statement: The switch statement allows you to choose from multiple cases based on the value of an expression.

Conditional statements are used to control the flow of execution in a program. They are used to make decisions based on conditions, to perform different actions for different inputs, and to repeat code until a certain condition is met. They are an essential part of any programming language and are used in almost every program.


Question:6 What is the syntax of if else statement?
Answer:The syntax of an if-else statement in Java is as follows:
if (condition) {
  // code to be executed if condition is true
} else {
  // code to be executed if condition is false
}

The condition is a boolean expression that is evaluated to determine whether it is true or false. If the condition is true, the code inside the first set of curly braces {} will be executed. If the condition is false, the code inside the second set of curly braces {} will be executed.


Question:7 What are the three types of iterative statements in java?
Answer:There are three types of iterative statements in Java:

i)For loop: The for loop is used to execute a block of code a specified number of times. The basic syntax of a for loop is:
for (initialization; condition; increment/decrement) {
  // code to be executed
}

ii)While loop: The while loop is used to execute a block of code as long as a specified condition is true. The basic syntax of a while loop is:

while (condition) {
  // code to be executed
}

iii)Do-while loop: The do-while loop is similar to the while loop, but it will always execute the block of code at least once, even if the condition is false. The basic syntax of a do-while loop is:
do {
  // code to be executed
} while (condition);

Iterative statements are used to repeat a block of code multiple times. They are an essential part of any programming language and are used to perform tasks such as counting, looping through arrays or lists, and processing data.


Question:8 Write the diffrence between for loop and do-while loop?
Answer:
The main difference between a for loop and a do-while loop in Java is the way in which the condition is evaluated and when the block of code is executed.

i)For loop: In a for loop, the condition is evaluated at the beginning of each iteration before the block of code is executed. If the condition is false, the loop will not execute and the program will continue with the next line of code after the loop. The basic syntax of a for loop is:

for (initialization; condition; increment/decrement) {
  // code to be executed
}

ii)Do-while loop: In a do-while loop, the block of code is executed first and then the condition is evaluated. If the condition is true, the loop will continue to execute. If the condition is false, the loop will terminate and the program will continue with the next line of code after the loop. The basic syntax of a do-while loop is:
do {
  // code to be executed
} while (condition);

In general, for loops are used when the number of iterations is known in advance, while do-while loops are used when the number of iterations is unknown or when you want the code to be executed at least once.

Question:9 Write a program to print numbers from 1 to 10.
Answer:

public class example
 {
  public static void main(String[] args)
    {
      for (int i = 1; i <= 10; i++) 
      {
      System.out.println(i);
      }
    }
}















