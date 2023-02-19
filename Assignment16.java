Question:1 WAP to remove duplicates from a string .
Answer: 
package demo;

import java.util.Scanner;

public class DuplicateString 
{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=Sc.nextLine();
		String Str1=str.replace(" ", "");
		char [] ch=Str1.toCharArray();
		String str2="";
	    for(int i=0;i<Str1.length();i++)
	    {
	    if(!str2.contains(String.valueOf(Str1.charAt(i))))
	    
	       str2=str2+Str1.charAt(i);
	    }
	    System.out.println(str2);
	}
}


Question:2 WAP to print duplicates characters from the string.
Answer:
package demo;
import java.util.Scanner;
public class DuplicateCharacters 
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        System.out.print("Duplicate characters in the string: ");
	        char[] ch = str.toCharArray();
	        for (int i = 0; i < ch.length; i++) 
	        {
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    System.out.print(ch[j] + " ");
	                    break;
	                }
	            }
	        }
	    }
	}


Question:3 WAP to check if "2552" is palindrome or not.
Answer: 
package demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the code to check");
		String str1=Sc.next();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
          if(str1.equals(str2))
          {
        	  System.out.println(str1 + " is equal to " + str2 +  " its Palindrome");
          }else
          {
        	  System.out.println(str1 + " is not equal to " + str2 + " its not a Palindrome");

          }
          
	}

}


Question:4 WAP to count the number of consonants , vowels,special characters in a string.
Answer:
package demo;
import java.util.Scanner;
public class countString 
{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=Sc.nextLine().toLowerCase().replace(" ", "");
		System.out.println(str);
		int consonants=0;
		int specialCharacters=0;
		int vowels=0;		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else
			{
				specialCharacters++;
			}
		}
		System.out.println("Number of vowels are:" + vowels);
		System.out.println("Number of consonants are :" + consonants);
		System.out.println("Number of special characters are:"+specialCharacters);
	
	}
	
	}


Question:5 WAP to implement Anagram checking least inbuilt methods being used.
Answer:package demo;

import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the first string");
    	String str=scan.nextLine().toLowerCase().replace(" ", "");
    	char[] strArr = str.toCharArray();
    		Arrays.sort(strArr);   	
       	System.out.println("Enter the second string");
    	String str1=scan.nextLine().toLowerCase().replace(" " ,"");
    	char strArr1[]=str1.toCharArray();
    	Arrays.sort(strArr1);
    	
    	if(Arrays.equals(strArr, strArr1))
    	{
    		System.out.println("The given string is an anagram");
    	}
    	else
    	{
    		System.out.println("The given string is not an anagram");

    	} 	      
    }
   }



Question:6 WAP to implement Pangram checking least inbuilt methods being used.
Answer:
package demo;

public class pangramString {
	public static void main(String[] args) {
		boolean flag = false;
		String str = "THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
		str = str.replace(" ", "");
		char[] ch = str.toCharArray();
		int ar[] = new int[26];
		for (int i = 0; i < ch.length; i++) {
			ar[ch[i] - 65]++;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				System.out.println("Its not pangram");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Its pangram");
		}
	}
}


Question:7 WAP to find if string contains all unique characters.
Answer:package demo;
import java.util.Scanner;
public class UniqueCharacters
{
    public static boolean hasUniqueCharacters(String str) 
    {
        boolean[] charSet = new boolean[256];       
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }    
    public static void main(String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Please enter the first string ");
        String str1 = scan.next();       
        if (hasUniqueCharacters(str1)) 
        {
            System.out.println(str1 + " contains all unique characters");
        } else {
            System.out.println(str1 + " does not contain all unique characters");
        }    
             
    }
}


Question:8 WAP to find the maximum occuring character in a string.
Answer:package demo;
import java.util.Scanner;
public class MaxOccurringChar
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter the string");
        String str = scan.next();
        int[] charCount = new int[256];         
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            charCount[ch]++;
        }        
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) 
        {
            if (charCount[i] > maxCount) 
            {
                maxChar = (char) i;
                maxCount = charCount[i];
            }
        }        
        System.out.println("The maximum occurring character in " + str + " is " + maxChar);
    }
}



