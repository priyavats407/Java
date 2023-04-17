       INTERFACE ASSIGNMENT QUE
—--------------------------------------------------------------

Que>1  What is an interface in java?

Ans> In Java, an interface is a collection of abstract methods and constants that define a set of behaviors or services that a class can provide. It defines a contract that a class must implement, specifying the methods and their signatures, but not providing an implementation for those methods.


Que>2 Which modifier are allows to for method in an interface??Explain with an example


Ans>> In Java, methods in an interface can have two types of modifiers:

1>public - This modifier is used to specify that the method can be accessed from any class. All methods in an interface are public by default.

2>default - This modifier was introduced in Java 8, and it is used to specify a default implementation for a method in an interface. A default method allows you to add new functionality to an interface without breaking the existing code that implements that interface.



public interface MyInterface {
    // A public method
    public void doSomething();
    
    // A default method
    default void doSomethingElse() {
        System.out.println("Doing something else...");
    }
}


QUE>3  what is the use of interface in java or why do we use an interface in java?

Ans> In Java, interfaces are used for a variety of reasons. Here are some of the main reasons why interfaces are used in Java:

Abstraction - Interfaces provide a way to define a set of methods without specifying their implementation. This allows for abstraction, where the details of the implementation can be left to the classes that implement the interface. This can make code more flexible and maintainable.

Multiple Inheritance - Java does not support multiple inheritance of classes, but a class can implement multiple interfaces. This allows for a class to inherit behavior from multiple sources.

Polymorphism - Interfaces can be used to achieve polymorphism, where objects of different classes can be treated as if they are of the same type if they implement the same interface. This allows for code to be more generic and reusable.

Separation of Concerns - Interfaces can be used to separate concerns, where one part of the code defines the interface and another part of the code implements it. This can make code more modular and easier to maintain.

Testing - Interfaces can be used to create mock objects for testing, where a class can be tested in isolation by creating a mock object that implements the same interface.


Que 4>>What is the difference between abstract class and interface in java?

Ans>>>In Java, both abstract classes and interfaces provide a way to achieve abstraction, but there are some key differences between them. Here are some of the main differences:

Method implementation - An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods (prior to Java 8). In Java 8 and later, interfaces can have default and static methods with implementations.

Multiple Inheritance - A class can only extend one abstract class, while it can implement multiple interfaces.

Accessibility - An abstract class can have any access specifier for its members (public, protected, private, etc.), while an interface can only have public members.

Constructors - An abstract class can have constructors, while an interface cannot.

Purpose - An abstract class is used to represent a common parent class for its subclasses, while an interface is used to define a set of methods that a class must implement.



