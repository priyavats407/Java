Question:1 What is  Mutable String in java ? Explain with an example.
Answer:
In Java, a mutable string refers to a string object whose value can be changed. In other words, you can modify the contents of a mutable string object by appending, inserting, deleting or replacing characters.

The most common example of a mutable string in Java is the StringBuilder class. StringBuilder is a class in the Java standard library that provides a mutable sequence of characters. You can create a new StringBuilder object and then modify its contents using various methods provided by the class.

Here's an example of how to use StringBuilder to create a mutable string:
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // prints "Hello World"
In the above example, we created a new StringBuilder object with the initial value "Hello". We then used the append method to add the string " World" to the end of the existing string. Finally, we converted the StringBuilder object to a string using the toString method and printed the result.

Note that StringBuilder is not the only way to create mutable strings in Java. The StringBuffer class is another option, although it is less commonly used in modern Java programming.


Question:2 WAP to reverse a String

Input: "PW SKILLS"
Outpout:"SKILLS PW"
Answer:
class example
{
public static void main(String[] a)
{

String str1="PW SKILLS";
		String sArr[] = str1.split(" ");
		String sb2=new String();
		

		for(int i=sArr.length-1;i>=0;i--)
		{
			sb2=sb2+sArr[i]+ " ";
			
		}
		System.out.println("Reversing the string from space :->"+sb2);
}
}


Question:3 WAP to reverse a string while preserving the position.
Input:Think Twice
Output:kniht eciwt

Answer:
public class example
{
public static void main(String[] abs)
{
String str1="Think twice";
    	String str2="";
		String arr[]=str1.split(" ");
		for(String element:arr)
		{
			for(int i=element.length()-1;i>=0;i--)
			{
				str2=str2+element.charAt(i);				
			}
			str2=str2+" ";			
		}	
		System.out.println();
		System.out.println("Reversing the string at its place :->"+str2);
    
}
}

Question:4 Write a program to sort a string alphabetically.
Answer:	
public class example
{
public static void main(String[] ab)
{
              String input = "";
    	        char[] chars = input.toCharArray();
    	        Arrays.sort(chars);
    	        String output = new String(chars);
    	        System.out.println(output);
}
}

		