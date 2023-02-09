Question:1 Write a simple program to take input from user?
Answer:
package com.inn.cafe;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeManagementSystemApplication {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		String b=scan.next();
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
	}
}


Question:2 How do you concatenate two strings in Java? Give an example.
Answer:
package com.inn.cafe;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeManagementSystemApplication {

	public static void main(String[] args) 
	{
		String string1 = "Hello";
		String string2 = "World";
		String concatenatedString = string1 + string2;
		System.out.println(concatenatedString);
	}
}


Question:3 How do you find the length of a string in java ? Explain with an example?
Answer: In Java, we can find the length of a string by using the length() method of the String class. The length() method returns an integer value representing the number of characters in the string. 
Here's an example:

String str = "Hello World!";
int length = str.length();
System.out.println("The length of the string is: " + length);

Output: The length of the string is: 12


Question:4 How do you compare two strings in java? Give an example.
Answer:In Java, there are two ways to compare two strings:

1)Using the equals() method:
String string1 = "Hello";
String string2 = "Hello";
Boolean areEqual = string1.equals(string2);
System.out.println("Are the strings equal: " + areEqual);

2) Using the compareTo() method:
String string1 = "Hello";
String string2 = "Hello";
int result = string1.compareTo(string2);
if (result == 0) {
  System.out.println("The strings are equal");
} else if (result < 0) {
  System.out.println("The first string is less than the second");
} else {
  System.out.println("The first string is greater than the second");
}

Output:The strings are equal

It's important to note that the equals() method performs a case-sensitive comparison, while the compareTo() method performs a lexicographical comparison.


Question:5 Write a program to find the length of the string "refrigerator"!
Answer:
public class Main {
  public static void main(String[] args) {
    String str = "refrigerator";
    int length = str.length();
    System.out.println("The length of the string 'refrigerator' is: " + length);
  }
}

Output: The length of the string 'refrigerator' is: 12

Question:6 Write a program to check if the letter 'e' is present in the word 'Umbrella'.
Answer: 
public class Main {
  public static void main(String[] args) {
    String word = "Umbrella";
    if (word.contains("e")) {
      System.out.println("The letter 'e' is present in the word Umbrella ");
    } else {
      System.out.println("The letter 'e' is not present in the word 'Umbrella'");
    }
  }
}

Output: The letter 'e' is present in Umbrella.

Question:7 Write a program to delete all consonants from the string "Hello , have a good day".
Answer:
public class Main {
  public static void main(String[] args) {
    String str = "Hello, have a good day";
    String vowels = "aeiouAEIOU";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (vowels.indexOf(c) != -1) {
        sb.append(c);
      }
    }
    System.out.println("The string with only vowels is: " + sb.toString());
  }
}


Output: The string with only vowels is: eoooaooa

