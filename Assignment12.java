Question1: What do you mean by an array?

Answer:An array is a data structure that holds a collection of elements, which can be of any data type such as numbers, strings, or objects. Elements in an array are stored in contiguous memory locations and can be accessed using an index. Arrays allow efficient index-based access to elements and are commonly used in programming for various tasks such as data manipulation, storing collections, or organizing information.

Question:2 How to create an array?
Answer: There are multiple ways for creating an array .Some of them are as follows:
   int[] a=new int[];
   int a[]=new int[];
   int a[]={1,2,3};
   int a[][]=new int[][];
   int[][] a=new int[][];

Question:3 Can we change the size of an array at run time?
Answer:In Java, the size of an array is fixed when it is created and cannot be changed dynamically. However, if we need to store a growing amount of data, we can use an ArrayList instead of an array. An ArrayList is a dynamic data structure that automatically resizes itself as you add or remove elements.

Question:4 Can you declare an array without assigning the size of an array?
Answer: Yes, we can declare an array without specifying its size in java,  but you would have to initialize it with a size before you can store elements in it. Here is an example of declaring an array in Java:
int[] num;
num= new int[5];
num[0]=1
num[1]=2
num[2]=3
num[3]=5
num[4]=9

Question:5 What is the default array of array?
Answer:In Java, arrays are objects, and when you create an array without initializing its elements, they are automatically assigned default values based on their data type.

Here are the default values for arrays of different data types:

For arrays of int, the default value is 0.
For arrays of float, the default value is 0.0f.
For arrays of double, the default value is 0.0.
For arrays of char, the default value is '\u0000'.
For arrays of boolean, the default value is false.
For arrays of objects (e.g. arrays of String or custom objects), the default value is null.

Question:6 What is a 1D array with an example?
Answer: A 1D (one-dimensional) array is a linear collection of elements, where each element can be accessed using a single index. The elements are stored in contiguous memory locations and can be of any data type such as numbers, strings, or objects.
 example:
  int[] number={1,2,3,4,5,6,7};

Question:7 Write a program on a 2D array?
Answer: 
public class example
{
   public static void main(String[] args)
    {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int a:numbers)
           {
             for(int b:numbers)
              {
                 System.out.println(b+ " ");
               }
              System.out.print();
           }
     }
}
















   