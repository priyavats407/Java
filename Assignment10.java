Question:1 How to create an object in java?
Answer: 
 For creation of the object we just have to use the following syntax:
   className objectName = new className();

Question:2 What is the use of a new keyword in java?
Answer: New keyword is used for the creation of a object.

Question:3 What are the different types of variable in java?
Answer: There are three types of variables available in java, these are as follows:-
  a)Instance variable
  b)Static variable
  c)Local Variable

Question:4 What is the difference between instance variable and local variable?
Answer: Instance variables are those variable which are declare in the class but outside the methods while local variable are declare within the methods.

Scope of instance variable : Until the class is in existence.
Scope of instance variable : Until the method is in existence.

Question:5 In which area memory is allocated for instance variable and local variable?
Answer : Memory for instance variable allocated in heap and memory allocated for local variable in stack.

Question:5 What is method overloading?
Answer: Method overloading may be defined as same method name but having different return type and arguments.
example:
 void subtract(int a , int b);
 int  subract(int a,int b);
 double subtract(double a, double b);
 float subtract(float a, float b);