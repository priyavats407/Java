Question:1 What is the default value of Array for different data types?
Answer:
Arrays are initialized with default values based on their data type:
For numeric data types (e.g. integers, floats), the default value is typically 0.
For Boolean data types, the default value is usually false.
For character data types, the default value is often an empty character or a null character.
For reference data types (e.g. objects, strings), the default value is usually null.

Question:2 Can you pass the negative number in array size?
Answer:No, it is not possible to pass a negative number as the size of an array in most programming languages. Array size must be a positive integer that specifies the number of elements that the array can store. Attempting to create an array with a negative size will typically result in an error or exception being thrown.

Question:3 Where does array stored in JVM Memory?
Answer:In Java, arrays are stored in the heap, which is a region of memory used for dynamic allocation of objects and data structures. The heap is managed by the Java Virtual Machine (JVM) and is used to store objects created at runtime.
Arrays in Java are objects, and they are dynamically allocated on the heap. When an array is created, the JVM reserves a contiguous block of memory on the heap to store the elements of the array. The memory for the elements of an array is stored consecutively in memory, which makes it possible for arrays to be accessed and manipulated efficiently.
It is important to note that the JVM automatically manages the heap and frees up memory that is no longer being used by the program, through a process known as garbage collection. This helps to ensure that memory is used efficiently and reduces the risk of memory leaks.

Question:4 What are the disadvantages of array?
Answer: 
Arrays have several disadvantages, including:

i)Fixed size: Arrays have a fixed size, so once they are created, their size cannot be changed dynamically. If the size of an array needs to be changed, a new array must be created and the elements of the old array must be copied to the new array.

ii)Waste of memory: If an array is declared with a size that is larger than the actual number of elements it will store, it can result in waste of memory.

iii)Time complexity: Searching for an element in an array can have a time complexity of O(n) in the worst case, where n is the number of elements in the array. This can make arrays less efficient for certain operations, such as searching, compared to data structures such as binary search trees.

iv)Limited functionality: Arrays provide limited functionality and do not have built-in methods for inserting or deleting elements. To perform these operations, the array must be manually manipulated, which can be time-consuming and error-prone.

v) Spport for data structures: Arrays do not provide support for data structures such as linked lists, stacks, or queues, which can make it difficult to implement certain algorithms or data structures.

Despite these disadvantages, arrays are still widely used in many applications due to their simplicity, ease of use, and efficient memory utilization for storing a large number of elements of the same type.

Question:5 What is an anonymous Array in java? Give an example?
Answer: An anonymous array in Java is an array that is declared and created in a single line of code without giving it a name. Anonymous arrays are usually used when the array is needed only for a short period of time, such as when it is passed as an argument to a method.

Question:6 What are the different ways to traverse an array in java?
Answer: There are several ways to traverse an array in Java:
i)For loop: The most common way to traverse an array is using a for loop. In a for loop, you can access each element of the array by its index and perform operations on it.
ii)Enhanced for loop: Java also provides an enhanced for loop that can be used to traverse an array without using an index. The enhanced for loop is a convenient way to iterate over the elements of an array.
iii)While loop: A while loop can also be used to traverse an array, although it is less common than the for loop and enhanced for loop.
iv)Stream API: Java 8 introduced the Stream API, which provides a functional way to process data. The stream method of the Arrays class can be used to create a stream from an array and the forEach method can be used to traverse the elements of the stream.


Question:7 What is the difference between length and length() method ? Give an example.
Answer:The difference between length and length() is that length is a property of arrays in Java and length() is a method of the String class.
a)The length property of an array returns the number of elements in the array.
b)The length() method of the String class returns the number of characters in a string. 
c)It's important to note that length is only available for arrays and cannot be used with other objects, while length() is a method that is specific to the String class and is not available for other objects.
