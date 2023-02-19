Question:1  What is encapsulation in java? Why is it called data hiding?
Answer:Encapsulation in Java is a mechanism of wrapping data and code together as a single unit, and restricting access to the internal components from outside the unit. In other words, encapsulation provides the ability to hide the complexity of the code and protect data from unauthorized access by making it accessible only through well-defined interfaces.

Encapsulation is often called data hiding because it involves hiding the internal details of an object's state (data) from the outside world. This means that the object's state can only be accessed and modified through its public methods, which act as a shield to protect the data from unwanted or accidental modification.

In Java, encapsulation is achieved through the use of access modifiers such as private, public, and protected. Private access modifier is used to restrict access to the class members from outside the class, whereas public access modifier allows unrestricted access to the class members. Protected access modifier allows access only to the subclass members and the members within the same package. By using access modifiers, the programmer can control the visibility of the class members and prevent unauthorized access to the class's internal data.


Question:2 What are the important features of encapsulation?
Answer:
The important features of encapsulation are:

Data Hiding: Encapsulation allows the data to be hidden from the outside world, making it accessible only through the methods defined in the class. This helps to prevent unauthorized access to the data, and thus protects the integrity of the data.

Access Modifiers: Encapsulation provides access modifiers such as private, protected, and public, which control the visibility of the class members. This helps in defining the level of access to the members of the class.

Bundling of Data and Methods: Encapsulation allows bundling of data and methods into a single unit, which helps in organizing the code and making it more manageable.

Code Reusability: Encapsulation promotes code reusability by providing an interface to access the data and methods of a class. This allows the code to be reused without having to modify the implementation details.

Security: Encapsulation helps in enhancing the security of the code by preventing direct access to the data. This helps in protecting the data from being modified accidentally or intentionally.

Easy Maintenance: Encapsulation makes the code easier to maintain by hiding the implementation details and providing a well-defined interface to access the class members. This makes it easier to make changes to the implementation without affecting the external code that uses the class.


Question:3 What are getter and setter methods in java? Explain with an example!
Answer:Getter and Setter methods, also known as accessor and mutator methods, are used in Java to access and modify the private variables of a class, respectively. These methods provide an interface to access and modify the state of an object while maintaining the principles of encapsulation.

Getter Methods:
Getter methods are used to retrieve the value of a private variable. They are defined with the public access modifier and have the return type of the variable being accessed. The naming convention for getter methods starts with "get" followed by the variable name with the first letter capitalized. For example:

public class Person {
    private String name;

    public String getName() {
        return name;
    }
}
In the above example, the getName() method returns the value of the private variable name of the Person class.

Setter Methods:
Setter methods are used to modify the value of a private variable. They are also defined with the public access modifier and have void return type. The naming convention for setter methods starts with "set" followed by the variable name with the first letter capitalized. The method takes an argument of the same type as the variable being modified. For example:
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
In the above example, the setName() method sets the value of the private variable name of the Person class to the value passed as an argument.

Using getter and setter methods, we can access and modify the private variables of a class while maintaining the principles of encapsulation. This helps in making the code more secure and maintainable.


Question:4 What is the use of this keyword ? Explain with an example.
Answer:In Java, the this keyword refers to the current instance of the class. It is used to differentiate between the instance variables of a class and the local variables of a method with the same name. The this keyword can also be used to call one constructor from another constructor in the same class.

Example 1 - Using this to differentiate between instance and local variables:
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name; // 'this' is used to refer to the instance variable
    }
    
    public void setName(String name) {
        this.name = name; // 'this' is used to differentiate between the instance and local variable
    }
}
In the above example, the this keyword is used to differentiate between the instance variable name and the parameter name of the constructor and the setName() method.

Example 2 - Using this to call a constructor from another constructor:
public class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this(name, 0); // calling another constructor of the same class
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
In the above example, the first constructor calls the second constructor using the this keyword. This is known as constructor chaining, where one constructor calls another constructor of the same class to initialize the object.

In summary, the this keyword is used to refer to the current instance of the class, differentiate between the instance and local variables, and call one constructor from another constructor in the same class.


Question:5 What is the advamtages of encapsulation?
Answer:Encapsulation is an important concept in object-oriented programming, and it offers several advantages, including:

Data protection: Encapsulation helps to protect the data by keeping it private, so it cannot be modified by external code. This helps to prevent the data from being corrupted, and it ensures that the data is accessed and modified only through the methods provided by the class.

Improved maintainability: Encapsulation helps to improve maintainability by hiding the implementation details of a class. This makes it easier to change the internal implementation of a class without affecting the external code that uses the class.

Code reuse: Encapsulation promotes code reuse by providing a well-defined interface to access the class members. This allows the code to be reused without having to modify the implementation details.

Security: Encapsulation helps to improve security by preventing direct access to the data. This helps to protect the data from being modified accidentally or intentionally.

Better design: Encapsulation helps to improve the design of a class by separating the behavior of a class from its implementation. This makes it easier to understand and modify the class, and it promotes good design practices.

Overall, encapsulation helps to improve the quality and reliability of the code by providing a structured and well-defined interface to access the class members, protecting the data from unauthorized access, and promoting good design practices.



Question:6 How to acheive encapsulation in java? Give an example.
Answer:Encapsulation in Java can be achieved by making the instance variables of a class private and providing public getter and setter methods to access and modify the values of these variables. The private variables are only accessible within the same class, and the getter and setter methods provide a controlled interface to access and modify the data.

Here's an example of encapsulation in Java:
public class Person {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
In the above example, the name and age instance variables are declared as private. This means that they cannot be accessed from outside the Person class. The public getter and setter methods getName(), setName(), getAge(), and setAge() are provided to access and modify the values of these variables.

Using encapsulation, the data is protected from direct access by external code, and it can be accessed and modified only through the public getter and setter methods provided by the class. This helps to maintain the integrity of the data and ensures that the class follows the principles of encapsulation.

