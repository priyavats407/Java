Question:1 Why do we need static keyword in java? Explain with the help of an example.
Answer:In Java, the static keyword is used to define a class-level variable or method that belongs to the class itself rather than an instance of the class. This means that a static member can be accessed without creating an instance of the class.

Here's an example to illustrate the use of the static keyword in Java:
public class Example {
    public static int count = 0;
    public int id;
    
    public Example() {
        this.id = ++count;
    }
    
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        
        System.out.println("e1 id: " + e1.id);
        System.out.println("e2 id: " + e2.id);
        System.out.println("Number of instances: " + count);
    }
}
In this example, we have a class Example with a static variable count and an instance variable id. We also have a constructor that initializes the id variable with a unique value for each instance, using the count variable.

In the main method, we create two instances of Example and print their id values. We also print the value of the count variable, which keeps track of the number of instances created so far.

Since count is declared as static, it belongs to the class itself, rather than any instance of the class. This means that we can access it directly using the class name, without needing to create an instance of the class.

By using the static keyword in this way, we can keep track of the total number of instances created, even though we are not explicitly counting them in our code. This can be useful in situations where we need to keep track of the number of objects of a particular class that have been created, or when we need to share a common value across all instances of a class.


Question:2 What is class loading and how does the java program actually executes?
Answer:
In Java, class loading is the process of locating and loading the bytecode of a class into the JVM's memory so that it can be executed. The Java Virtual Machine (JVM) loads classes as they are needed during program execution, and it uses a class loader to locate and load the bytecode of each class.

The Java program execution follows these steps:

Compilation: The Java source code is compiled into bytecode by the Java compiler. This bytecode is a platform-independent representation of the original source code.

Loading: The class loader is responsible for locating and loading the bytecode of the class into the JVM's memory. The JVM's built-in class loader loads the classes from the system classpath, while custom class loaders can be used to load classes from other locations such as a database or network.

Linking: Once the class is loaded, it is then linked. This involves verifying the bytecode to ensure that it is valid, resolving any references to other classes, and preparing the class for execution by allocating memory for its static fields.

Initialization: Finally, the class is initialized. This involves executing any static initializers and initializing the values of the class's static fields.

During program execution, when a new object is created, the JVM allocates memory for the object and initializes its instance fields. When a method is called, the JVM looks up the bytecode for the method and executes it. If the method calls other methods or accesses fields from other classes, those classes are loaded and linked as needed.

Overall, the process of class loading is an important part of the Java runtime environment, as it enables the JVM to execute Java programs by dynamically loading and linking the required classes.


Question:3 Can we mark a local variable as static?
Answer:
No, we cannot mark a local variable as static in Java.

The static keyword is used to create class-level variables or methods, which are associated with the class itself rather than with any instance of the class. Local variables, on the other hand, are defined within a method or block of code and are associated with a particular execution of that method or block.

Since local variables are not associated with the class, marking them as static does not make sense and is not allowed in Java. Attempting to declare a local variable as static will result in a compile-time error.

Here's an example that demonstrates this:
public class Example {
    public void someMethod() {
        static int count = 0; // Compilation error: illegal start of expression
        count++;
        System.out.println("Count: " + count);
    }
}

In this example, we have a method someMethod() that attempts to declare a local variable count as static. This will result in a compilation error, as static is not a valid modifier for local variables.

Question:4 Why is the static block executed before the main method in java?
Answer: In Java, the static block is executed before the main method because it is part of the class loading process.

When a Java program is executed, the JVM first loads the class that contains the main method. During the loading process, the JVM initializes the static variables and executes the static blocks of the class, in the order in which they are declared.

Once the static blocks have been executed and the static variables have been initialized, the main method is executed. This ensures that any necessary setup or initialization is performed before the program starts running.

Here's an example that demonstrates this:
public class Example {
    static {
        System.out.println("Static block executed");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
In this example, we have a class Example with a static block and a main method. When we run the program, the static block is executed first, and its message "Static block executed" is printed to the console. Then, the main method is executed, and its message "Main method executed" is printed to the console.

This ordering ensures that any necessary initialization or setup is performed before the program starts running, which can be important for some programs. For example, if a program needs to read configuration files or connect to a database, it can perform those tasks in a static block to ensure that they are completed before the main method starts executing.


Question:5 Why is a static method also called as a class method?
Answer: A static method is also called a class method because it is associated with the class rather than with any instance of the class.

In Java, a static method is a method that is declared with the static keyword. Static methods can be called using the class name, without the need to create an instance of the class first. This is because static methods are associated with the class itself, rather than with any particular instance of the class.

Since static methods are associated with the class and not with any instance of the class, they are sometimes referred to as "class methods". This helps to distinguish them from instance methods, which are associated with a particular instance of the class.

Here's an example that demonstrates this:
public class Example {
    public static void staticMethod() {
        System.out.println("Static method called");
    }
    
    public void instanceMethod() {
        System.out.println("Instance method called");
    }
}

// Calling the static method
Example.staticMethod();

// Creating an instance of the class and calling the instance method
Example obj = new Example();
obj.instanceMethod();

In this example, we have a class Example with a static method staticMethod() and an instance method instanceMethod(). We can call the static method using the class name, as Example.staticMethod(). We can call the instance method only after creating an instance of the class, as obj.instanceMethod(), where obj is an instance of the class.

The distinction between static methods and instance methods is important in Java, as it allows us to create methods that are associated with the class itself, as well as methods that are associated with individual instances of the class.


Question:6 What is the use of static block in java?
Answer:The static block in Java is a block of code enclosed in braces that is executed only once, when the class is loaded into memory. It is used to perform some initialization tasks that need to be executed only once, such as initializing static variables or setting up a static resource that will be used by all instances of the class.

Here are some common use cases for static blocks in Java:

Initializing static variables: Static blocks can be used to initialize static variables that are not constant, or whose values depend on some external factors. For example, if we have a static variable that holds a configuration value, we can initialize it in a static block that reads the value from a configuration file.

Setting up a static resource: Static blocks can be used to set up a static resource, such as a database connection or a file handle, that will be used by all instances of the class. For example, if we have a database-backed class, we can set up a static block that creates a database connection that will be shared by all instances of the class.

Performing some one-time setup: Static blocks can be used to perform some one-time setup that needs to be done before the class can be used. For example, if we have a class that uses some external library, we can set up a static block that loads the library into memory.

Here's an example that demonstrates the use of static blocks in Java:
public class Example {
    static {
        // Initialize a static variable
        System.out.println("Initializing static variable");
        int staticVar = 42;
        
        // Set up a static resource
        System.out.println("Setting up static resource");
        // ... code to set up the resource ...
        
        // Perform some one-time setup
        System.out.println("Performing one-time setup");
        // ... code to perform the setup ...
    }
    
    public static void main(String[] args) {
        // Code that uses the class
        // ...
    }
}

In this example, we have a class Example with a static block that initializes a static variable, sets up a static resource, and performs some one-time setup. The static block is executed only once, when the class is loaded into memory, and its output is printed to the console.


Question:7 Difference between static and instance variables.
Answer:
In Java, there are two types of variables: static variables and instance variables. Here are the differences between them:

Declaration and scope:
Static variables are declared using the static keyword and are associated with the class, while instance variables are declared inside the class and are associated with each instance of the class. Static variables can be accessed using the class name, while instance variables are accessed using the instance name.

Memory allocation:
Static variables are allocated memory only once, when the class is loaded into memory, while instance variables are allocated memory each time an instance of the class is created. This means that static variables are shared by all instances of the class, while each instance has its own copy of instance variables.

Lifetime:
Static variables have a lifetime that is equal to the lifetime of the class, while instance variables have a lifetime that is equal to the lifetime of the instance. This means that static variables are initialized only once, and their values persist throughout the lifetime of the class, while instance variables are initialized each time an instance of the class is created, and their values persist throughout the lifetime of the instance.

Initialization:
Static variables can be initialized either when they are declared, or in a static block, while instance variables can be initialized either when they are declared, or in the constructor of the class.

Access:
Static variables can be accessed using the class name, while instance variables can be accessed using the instance name.

Here's an example that demonstrates the difference between static and instance variables:

public class Example {
    // static variable
    static int staticVar = 0;
    
    // instance variable
    int instanceVar = 0;
    
    public static void main(String[] args) {
        // accessing static variable using class name
        Example.staticVar = 1;
        
        // creating instance of the class
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        // accessing instance variables using instance names
        obj1.instanceVar = 2;
        obj2.instanceVar = 3;
        
        // accessing static variable using instance name
        obj1.staticVar = 4;
        
        // printing values
        System.out.println("staticVar: " + Example.staticVar);
        System.out.println("obj1.instanceVar: " + obj1.instanceVar);
        System.out.println("obj2.instanceVar: " + obj2.instanceVar);
        System.out.println("obj1.staticVar: " + obj1.staticVar);
    }
}

In this example, we have a class Example with a static variable staticVar and an instance variable instanceVar. We access the static variable using the class name, and the instance variables using the instance names. We create two instances of the class obj1 and obj2, and set their instance variables to different values. We also set the static variable of obj1 to a different value. We then print the values of all the variables.

The output of the program is:
staticVar: 4
obj1.instanceVar: 2
obj2.instanceVar: 3
obj1.staticVar: 4

This shows that the static variable is shared by all instances of the class, while each instance has its own copy of the instance variable.

Question:8 Difference between static and non static members.
Answer:In Java, there are two types of members in a class: static and non-static. Here are the differences between them:

Declaration and scope:
Static members are declared using the static keyword and are associated with the class, while non-static members are declared inside the class and are associated with each instance of the class. Static members can be accessed using the class name, while non-static members are accessed using the instance name.

Memory allocation:
Static members are allocated memory only once, when the class is loaded into memory, while non-static members are allocated memory each time an instance of the class is created. This means that static members are shared by all instances of the class, while each instance has its own copy of non-static members.

Lifetime:
Static members have a lifetime that is equal to the lifetime of the class, while non-static members have a lifetime that is equal to the lifetime of the instance. This means that static members are initialized only once, and their values persist throughout the lifetime of the class, while non-static members are initialized each time an instance of the class is created, and their values persist throughout the lifetime of the instance.

Initialization:
Static members can be initialized either when they are declared, or in a static block, while non-static members can be initialized either when they are declared, or in the constructor of the class.

Access:
Static members can be accessed using the class name, while non-static members can be accessed using the instance name.

Here's an example that demonstrates the difference between static and non-static members:

public class Example {
    // static variable
    static int staticVar = 0;
    
    // non-static variable
    int nonStaticVar = 0;
    
    // static method
    public static void staticMethod() {
        System.out.println("staticVar: " + staticVar);
        // nonStaticVar cannot be accessed here as it belongs to the instance
    }
    
    // non-static method
    public void nonStaticMethod() {
        System.out.println("nonStaticVar: " + nonStaticVar);
        System.out.println("staticVar: " + staticVar);
    }
    
    public static void main(String[] args) {
        // accessing static variable using class name
        Example.staticVar = 1;
        
        // creating instance of the class
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        // accessing non-static variable using instance names
        obj1.nonStaticVar = 2;
        obj2.nonStaticVar = 3;
        
        // calling static method using class name
        Example.staticMethod();
        
        // calling non-static method using instance names
        obj1.nonStaticMethod();
        obj2.nonStaticMethod();
    }
}

In this example, we have a class Example with a static variable staticVar and a non-static variable nonStaticVar. We also have a static method staticMethod and a non-static method nonStaticMethod. We access the static variable using the class name, and the non-static variable using the instance names. We call the static method using the class name, and the non-static method using the instance names. We create two instances of the class obj1 and obj2, and set their non-static variables to different values.

The output of the program is:
staticVar: 1
nonStaticVar: 2
staticVar: 1
nonStaticVar: 3
staticVar: 1

This shows that the static variable is shared by all instances of the class, while each instance has its own copy of the non-static variable. The static method can only access static members.
