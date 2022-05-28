## 1. How Java "Hello, World!" Program Works?
* In Java, every application begins with a class definition.
 In the program, Main is the name of the class, and the class definition is:
 ```
    public class Main {
        // code
    }
}
 ```
* For now, just remember that every Java application has a class definition, and the name of the class should match the filename in Java. 

* public static void main(String[] args) { ... }

This is the main method. Every application in Java must contain the main method. The Java compiler starts executing the code from the main method.

 The signature of the main method in Java is:
 ```
    public static void main(String[] args) {
        ... .. ...
    }   
 ```

 ## 2. Java JDK, JRE and JVM

 ### What is JVM?

JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.

When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your physical machine (computer). Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.

![alt text](https://cdn.programiz.com/sites/tutorial2program/files/how-java-program-runs.jpg)

### What is JRE?
JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications.

JRE is the superset of JVM.

![alt text](https://cdn.programiz.com/sites/tutorial2program/files/java-realtime-enviornment_0.jpg)

### What is JDK?
JDK (Java Development Kit) is a software development kit required to develop applications in Java. When you download JDK, JRE is also downloaded with it.

In addition to JRE, JDK also contains a number of development tools (compilers, JavaDoc, Java Debugger, etc).
![alt text](https://cdn.programiz.com/sites/tutorial2program/files/java-development-kit.jpg)

### Relationship between JVM, JRE, and JDK.
![alt text](https://cdn.programiz.com/sites/tutorial2program/files/jdk-jre-jvm.jpg)

## Java Variables
A variable is a location in memory (storage area) to hold data.

* Create Variables in Java

Here's how we create a variable in Java,
```
    int speedLimit = 80;
```
```
    int speedLimit;
    speedLimit = 80;
```
* Change values of variables

The value of a variable can be changed in the program, hence the name variable. For example,
```
    int speedLimit = 80;
    ... .. ...
    speedLimit = 90; 
```
* There are 4 types of variables in Java programming language:

    * Instance Variables (Non-Static Fields)
    * Class Variables (Static Fields)
    * Local Variables
    * Parameters

## Java Literals

# . . . 

## Java Data Types

As the name suggests, data types specify the type of data that can be stored inside variables in Java.

Java is a statically-typed language. This means that all variables must be declared before they can be used.
```
    int speed;
```
* Here, speed is a variable, and the data type of the variable is *int.*

* The *int* data type determines that the speed variable can only contain integers.

* There are 8 data types predefined in Java, known as primitive data types.

### Primitive Data Types
1. boolean type

    * The boolean data type has two possible values, either true or false.
    * Default value: false.
    * They are usually used for true/false conditions.

Example 1: Java boolean data type
```
    boolean flag = true;
```

2. byte type

    * The byte data type can have values from -128 to 127 (8-bit signed two's complement integer)
    * If it's certain that the value of a variable will be within -128 to 127, then it is used  instead of int to save memory.
    * Default value: 0
Example 2: Java byte data type
```
    byte range;
```
3. short type

    * The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
    * If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
    * Default value: 0

Example 3: Java short data type
```
    short temperature;
    temperature = -200;
```
4. int type

    * The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
    * If you are using Java 8 or later, you can use an unsigned 32-bit integer. This will have a minimum value of 0 and a maximum value of 232-1. To learn more, visit How to use the * unsigned integer in java 8?
    * Default value: 0

Example 4: Java int data type
```
    int range = -4250000;
```
5. long type

    The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
    If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
    Default value: 0

Example 5: Java long data type
```
    long range = 1234344;
```
6. double type

    The double data type is a double-precision 64-bit floating-point.
    It should never be used for precise values such as currency.
    Default value: 0.0 (0.0d)

Example 6: Java double data type
```
    double number = -42.3;
```

7. float type

    The float data type is a single-precision 32-bit floating-point. Learn more about single-precision and double-precision floating-point if you are interested.
    It should never be used for precise values such as currency.
    Default value: 0.0 (0.0f)

Example 7: Java float data type
```
    float number = -42.3f;
```
Notice that we have used -42.3f instead of -42.3in the above program. It's because -42.3 is a double literal.

To tell the compiler to treat -42.3 as float rather than double, you need to use f or F.

8. char type

    It's a 16-bit Unicode character.
    The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
    Default value: '\u0000'

Example 8: Java char data type
```
    char letter = '\u0051';
    System.out.println(letter);  // prints Q

    char letter1 = '9';
    System.out.println(letter1);  // prints 9
    	
    char letter2 = 65;
    System.out.println(letter2);  // prints A
```

## String type

Java also provides support for character strings via java.lang.String class. Strings in Java are not primitive types. Instead, they are objects. For example,
```
    String myString = "Java Programming";
```

Here, myString is an object of the String class. 

# Java Operators

* In this tutorial, you'll learn about different types of operators in Java, their syntax and how to use them with the help of examples.

* Operators are symbols that perform operations on variables and values. For example, + is an operator used for addition, while * is also an operator used for multiplication.

* Operators in Java can be classified into 5 types:

    1. Arithmetic Operators
    2. Assignment Operators
    3. Relational Operators
    4. Logical Operators
    5. Unary Operators
    6. Bitwise Operators

## Java Basic Input and Output

## JDBC
* JDBS API interfacelari
* Asosan 2 xil turdagi interfacega ega
    1. dastur yaratuvchilar uchun
    2. driver yaratuvchilar uchun

* MOBT bilan bog'lanish: 
```
    java.sql.Connection
```
* 
```
    java.sql.Statement          // oddiy querylar uchun
    java.sql.PreparedStatement  // qurylar ni parametrlar bilan ishlatish uchun
    java.sql.CallableStatement  // functiya va precuduralarni chaqirish uchun
    java.sql.ResultSet          // 
```
