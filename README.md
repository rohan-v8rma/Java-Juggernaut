<!-- TOC -->
# INDEX

- [INDEX](#index)
- [Differences between Java and C++](#differences-between-java-and-c)
- [Naming Conventions in Java](#naming-conventions-in-java)
- [How Java code executes](#how-java-code-executes)
- [Platform independence of Java and difference from C++](#platform-independence-of-java-and-difference-from-c)
  - [Byte code vs. Source code](#byte-code-vs-source-code)
- [JDK vs. JRE vs. JVM vs. JIT](#jdk-vs-jre-vs-jvm-vs-jit)
  - [JDK (Java Development Kit)](#jdk-java-development-kit)
    - [More about `javadoc`](#more-about-javadoc)
      - [Where should we put comments for `javadoc`?](#where-should-we-put-comments-for-javadoc)
  - [JRE (Java Runtime Environment)](#jre-java-runtime-environment)
  - [JVM (Java Virtual Machine)](#jvm-java-virtual-machine)
    - [Class Loader Subsystem](#class-loader-subsystem)
      - [Loading](#loading)
      - [Linking](#linking)
      - [Initialization](#initialization)
    - [Execution Engine](#execution-engine)
      - [Java Interpreter](#java-interpreter)
      - [`JIT` (Just-In-Time) compiler](#jit-just-in-time-compiler)
      - [Garbage Collector](#garbage-collector)
    - [Runtime Data Areas](#runtime-data-areas)
- [What is a Specification?](#what-is-a-specification)
- [Basic Java program](#basic-java-program)
  - [Packages in Java](#packages-in-java)
    - [Creating a Package](#creating-a-package)
    - [Dynamically importing classes from packages in Java](#dynamically-importing-classes-from-packages-in-java)
    - [Some in-built packages...](#some-in-built-packages)
      - [`java.lang`](#javalang)
      - [`java.io`](#javaio)
      - [`java.util`](#javautil)
  - [Access Modifiers in Java](#access-modifiers-in-java)
  - [Classes in Java](#classes-in-java)
    - [`java.lang.Object` class](#javalangobject-class)
    - [Creating an Object of a Class](#creating-an-object-of-a-class)
    - [Wrapper Classes in Java](#wrapper-classes-in-java)
      - [Need of Wrapper Classes](#need-of-wrapper-classes)
    - [`java.lang.String` class](#javalangstring-class)
    - [`java.util.Random` class](#javautilrandom-class)
      - [`nextInt()` method](#nextint-method)
      - [`doubles()`, `ints()` and `longs()`  method](#doubles-ints-and-longs--method)
    - [`java.lang.Math` class](#javalangmath-class)
      - [`Math.random()`](#mathrandom)
      - [Getting a random floating-point number between 2 bounds using `Math`](#getting-a-random-floating-point-number-between-2-bounds-using-math)
      - [Getting a random integer between 2 bounds using `Math`](#getting-a-random-integer-between-2-bounds-using-math)
- [Data Types in Java](#data-types-in-java)
  - [Primitive Data Types in Java](#primitive-data-types-in-java)
    - [`int`](#int)
    - [`byte`](#byte)
    - [`char`](#char)
      - [Default Initialization Value for `char`](#default-initialization-value-for-char)
      - [What is Unicode?](#what-is-unicode)
      - [Difference between ASCII and Unicode](#difference-between-ascii-and-unicode)
  - [Non-Primitive data types in Java](#non-primitive-data-types-in-java)
    - [`java.lang.String`](#javalangstring)
    - [`java.lang.Character`](#javalangcharacter)
    - [`java.lang.Double`](#javalangdouble)
      - [Infinity in Java](#infinity-in-java)
    - [Arrays](#arrays)
      - [Declaring, Creating & Initializing an Array](#declaring-creating--initializing-an-array)
      - [Specifying the number of elements in an Array](#specifying-the-number-of-elements-in-an-array)
      - [Printing an Array `java.util.Arrays.toString(Object[] a)`](#printing-an-array-javautilarraystostringobject-a)
  - [Streams (`java.util.stream`)](#streams-javautilstream)
    - [Converting Streams to Arrays : `toArray()`](#converting-streams-to-arrays--toarray)
  - [Type-casting in Java (Forcing Lossy Conversions)](#type-casting-in-java-forcing-lossy-conversions)
  - [Automatic Type Conversion in Expressions in Java](#automatic-type-conversion-in-expressions-in-java)
  - [Brackets & Operator Precedence](#brackets--operator-precedence)
- [Conditional and Looping Statements](#conditional-and-looping-statements)
  - [if-else statements](#if-else-statements)
  - [`for-each` loop (looping through Array elements)](#for-each-loop-looping-through-array-elements)
  - [switch-case](#switch-case)
- [Taking Input in Java](#taking-input-in-java)
  - [Taking input of `int`](#taking-input-of-int)
  - [Taking input of `String`](#taking-input-of-string)
    - [Taking input of one word](#taking-input-of-one-word)
    - [Taking input of multiple words](#taking-input-of-multiple-words)
  - [Taking input of one character (`char`)](#taking-input-of-one-character-char)
  - [Checking if input stream still has data left](#checking-if-input-stream-still-has-data-left)
  - [Special cases while taking input shown practically](#special-cases-while-taking-input-shown-practically)
- [Functions in Java](#functions-in-java)
  - [Return values](#return-values)
  - [No pass-by-reference](#no-pass-by-reference)
  - [References in Modern Languages](#references-in-modern-languages)
  - [Java NOT having pointers](#java-not-having-pointers)
- [TODO](#todo)

<!-- TOC -->


<!-- Application runs directly on computer
Applet runs on browser -->

# Differences between Java and C++

Java is partially modeled on C++, but greatly simplified and improved.

For instance, pointers and multiple inheritance often make programming complicated. Java replaces the multiple inheritance in C++ with a simple language construct called an interface, and eliminates pointers. 

Java uses automatic memory allocation and [garbage collection](#garbage-collector), whereas C++ requires the programmer to allocate memory and collect garbage. 

Also, the number of language constructs is small for such a powerful language. The clean syntax makes Java programs easy to write and read. Some people refer to Java as "C++--" because it is like C++ but with more functionality and fewer negative aspects


# Naming Conventions in Java

The below list outlines the standard Java naming conventions for each identifier type:

- [`Classes`](#classes-in-java): Names should be in `PascalCase`. Try to use nouns because a class is normally representing something in the real world:
  ```java
  class Customer 
  class Account 
  ```
  We should also keep the file names of the `.java` files same as the classes.

  For example, the `Main` class should be written in `Main.java`.

- Projects: Every Java program, also referred to as a 'Project' consists of one or more `.java` files, enclosed in a folder. 
  
  ![](./images/java-files-in-project.png)
  
  Project names should be in `PascalCase` as well. 
  <!-- In IDEs like NetBeans, we can choose  -->

- `Interfaces`: Names should be in `PascalCase`. They tend to have a name that describes an operation that a class can do:
  ```java
  interface Comparable 
  interface Enumerable 
  ```
  Note that some programmers like to distinguish interfaces by beginning the name with an "I":
  ```java
  interface IComparable 
  interface IEnumerable
  ```
- `Methods`: Names should be in `camelCase`. Use verbs to describe what the method does:
  ```java
  void calculateTax()
  string getSurname() 
  ```
- `Variables`: Names should be in `camelCase`. The names should represent what the value of the variable represents:
  ```java 
  string firstName 
  int orderNumber 
  ```
- `Constants`: Names should be in `UPPER_SNAKE_CASE`.
  ```java
  static final int DEFAULT_WIDTH 
  static final int MAX_HEIGHT
- [`Packages`](#packages-in-java): Names should be in lowercase. With small projects that only have a few packages it's okay to just give them simple (but meaningful!) names:
  ```java
  package pokeranalyzer
  package mycalculator 
  ```
  In software companies and large projects where the packages might be imported into other classes, the names will normally be subdivided. 
  
  Typically this will start with the company domain before being split into layers or features:
  ```java
  package com.mycompany.utilities 
  package org.bobscompany.application.userinterface 
  ```

# How Java code executes

![](./images/how_java_executes.png)

The Java compiler compiles source code contained within a `.java` file into a `.class` file containing byte code, which is some intermediate language of java, that needs a JVM (Java Virtual Machine) to run.

Then, JVM converts the byte code into machine code, by interpreting line-by-line. 

The process by which byte code is formed in known as **compile time**.

The subsequent steps where a JVM is required, is known as **run time**.

# Platform independence of Java and difference from C++

The byte code of Java can run on all operating systems. 

For example, if a piece Java code compiled into byte code on a Windows system. That byte code can be run on a Linux system as well.

This is unlike in C++, where if we use the [`gcc` compiler](https://github.com/rohan-verma19/learning-C#gcc-compiler) on a Linux system to [convert the Source code into an executable file](https://github.com/rohan-verma19/learning-C#source-code-to-executable-file), that executable can be run on another Linux system but not on a Windows system.

For that, the source code would have to be process using re-compiled (note that here, 'compilation' signifies a number of other processes like assembling, linking, etc) on the Windows system to create a Windows executable `.exe` file.

Executable files contain Machine code (0s and 1s), which is essentially a set of instructions for the computer, that depend on the architecture of the computer's CPU as well as its file system. This is why a Windows executable file can't be run on Linux.

Although Java is platform-independent, JVM is platform dependent.

## Byte code vs. Source code

Now, the question may arise that if we still need a JVM to run byte code, why not just keep the Source code of Java in a `.java` file as it is, and just convert that source code into an executable directly, on each different operating system? 

This is because byte code occupies more than 6 times less memory than java source code. A lot of data/visual representation of code that is required for it to be human readable, is cut out when source code is converted to byte code, explaining its reduced size.

# JDK vs. JRE vs. JVM vs. JIT

![](./images/JDK_JRE_JVM_JIT.png)

## JDK (Java Development Kit)

JDK provides an environment to develop and run the Java program. 

It is a package that includes:
- development tools - to provide an environment to develop your program.
- [JRE](#jre-java-runtime-environment) - to execute your program.
- a compiler, `javac` that converts `.java` files (source code) to `.class` files (byte code). This is achieved during the **compile time**.
- archiver - `jar`
- a documentation generator [`javadoc`](#more-about-javadoc)
- interpreter/loader

### More about `javadoc`

`javadoc` is the official way of writing API documentation. 

We must follow a certain syntax and structure for writing comments in `.java` source files. 

The `javadoc` tool which is included in the JDK, parses a source file and generates HTML documentation from it.

#### Where should we put comments for `javadoc`?
![](./images/where-to-put-javadoc.png)

## JRE (Java Runtime Environment)

JRE is an installation package that provides environment to only run the program.

It consists of:
- Deployment technologies
- User interface toolkits
- Integration libraries
- Base libraries
- [JVM](#jvm-java-virtual-machine)

In simple words, JRE is JVM along with a collection of extra files.

After we obtain the `.class` file, the processes that take place at runtime are:
- Class loader loads all classes needed to execute the program.
- JVM sends code to Byte code verifier to check the format of the code.

## JVM (Java Virtual Machine)

TODO : Understand java bytecode is evaluated on virtual stack based processor

JVM is a [specification](#what-is-a-specification) that provides a runtime environment in which Java bytecode can be executed. 

JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist.

It loads, verifies and executes Java bytecode. It is known as the interpreter or the core of Java programming language because it executes Java programming.

JRE provides whatever files/resources JVM needs.

JVM consists of three main components or subsystems:

### Class Loader Subsystem 

It is responsible for [loading](#loading), [linking](#linking) and initializing a Java class file (i.e., “Java file”), otherwise known as dynamic class loading.

#### Loading

- Byte code class file is read and binary data is generated, in order to create an object of this 'class' in heap.
- JRE libraries that are being used are also loaded into memory.

Both these processes comprise **loading** into memory.

#### Linking 

- `.class` file is verified (for errors or illegal practices).
- Memory is allocated for class variable and default values.
- Symbolic references are replaced with direct references (**linking** takes place).

#### Initialization

All static variables (variables that have only one value for a particular class, instead of a different value for each instance of said class) are assigned with their values and defined in the code & stack block.
  

### Execution Engine

Contains an interpreter, compiler and garbage collector

#### Java Interpreter

It reads the byte code and interprets (convert line-by-line) into the machine code and executes them in a sequential manner. 

The problem with the interpreter is that it interprets every time, even the same method multiple times, which reduces the performance of the system. 

#### `JIT` (Just-In-Time) compiler

- JIT compiler counterbalances the interpreter’s disadvantage of slow execution and improves the performance.
- It aids in improving the performance of Java programs by compiling bytecode into native machine code at run time.
- It is ENABLED throughout, while it gets ACTIVATED when a method is invoked. For a compiled method, the JVM directly calls the compiled code, instead of interpreting it.

#### Garbage Collector

This is a program in java that manages the memory automatically. 

It is a daemon thread which always runs in the background. 

This basically frees up the heap memory by destroying objects that have no reference variables pointing to them or objects which have been corrupted due to overwriting.

### Runtime Data Areas

Contain method areas, PC registers, stack areas and threads.

![](./images/source-to-executable.png)

# What is a Specification?

Specification means you describe how something should work, not what one has to do in order to let it work (which is the implementation).

As mentioned in the preface to the Java SE 8 Edition by Oracle:

**... An implementation of the Java Virtual Machine must embody this specification, but is constrained by it only where absolutely necessary.**

This meant that Oracle SPECIFIED how a JVM should work and left the implementation to the organization building the JVM.

This explanation of what a specification is, is universal in the domain of computing.

# Basic Java program

```java
1 package examplepackage;
2
3 public class Main {
4   public static void main(String[] args) {
5     System.out.println("Hello World");
6   };
7 };
```
 Now, at first glance this may look like a lot of code for just printing `Hello World`. But lets look at the lines one by one.

- The reasoning for the first line is given under [Packages in Java](#packages-in-java). 

  In simple words, it is for including the contents of our program under the namespace of a particular package.

- The access modifiers used can be read about [below](#access-modifiers-in-java).

- By default, JVM invokes the `main()` method of `public` class within a `.java` file. JVM always looks for the `main()` method with a `String` type Array as a parameter.

- The reasoning for keeping the `main()` method as `static` is quite practical.

  If a method or data member is `static`, that data member/method can be called directly using class name without creating an instance of the class. Note that `static` members can be accessed using instances AS WELL.
 
  So, JVM need NOT instantiate the class `Main` and can directly call the method.
  
- `String[] args` is the syntax for declaring an array in Java. 

  It is kept as an argument for the `main()` method for taking the input of arguments of the type `String` when running the executable of the source file as shown:
  ```console
  java ClassName argumentOne argumentTwo argumentThree
  ```

  Indices along with the array name can be used for accessing the arguments we give as shown:
  ```java
  System.out.println(args[0]);
  System.out.println(args[1]);
  ```
  Since the `main()` method is the entry point of the Java program, whenever we execute a class file, the JVM searches for a `main()` method, which is `public`, `static`, with return type `void`, and a `String` array as an argument. If anything is missing the JVM raises an error.
  
## Packages in Java

Packages are used in Java in order to prevent naming conflicts, to control access, to make searching/locating and usage of classes, interfaces, enumerations and annotations easier, etc.

### Creating a Package

While creating a package, we  should choose a name for the package and include a `package` statement along with that name at the top of every source file that contains the classes, interfaces, enumerations, and annotation types that you want to include in the package.

it should look like this: 
```java
package packagename
```
with the name of the package in lowercase.

### Dynamically importing classes from packages in Java

We can dynamically import classes from Java's in-built pre-existing packages using the universal selector `*`.

```java
import java.util.*;
```
Only the classes we use from the `util` package will be imported.

There is no performance difference if we just import the a specific class like `Scanner` or use the universal selector.

### Some in-built packages...

#### `java.lang` 

Bundles the fundamental classes such as: `System`, `String`, etc.

It is included by default, which is why we need not explicitly include it everytime we need to use a class in this package.

#### `java.io` 

Contains classes for input , output functions are bundled in this package.

#### `java.util` 

It contains the collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and a bit array).

## Access Modifiers in Java

- `Private`: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

- `Default`: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- `Protected`: The access level of a protected modifier is within the package and outside the package through child class. 

  If you do not make a child class, it cannot be accessed from outside the package.
- `Public`: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

    This has the widest scope amongst all access modifiers.

    There can be only one public class in a single java file. 

    Let's take an example to understand this. A and B are public classes defined in the same file, and the file name say `A.java`.

    When we compile this file and compiler wants to create `.class` file then compiler gets confused to decide which name to take while creating `.class` file since both are public and public modifier has highest precedence among all modifiers, so in this case it creates ambiguity. 
   
    So, in order to avoid this kind of scenario Java specification does not allow 2 public classes in a single file.

## Classes in Java

If a single source file contains multiple Classes, all of the classes have separate class files. 
![](./images/class_files.png)

In most IDEs, only the `.class` file of the public class would be displayed. 

Navigating to the folder where that `.class` file is present using the terminal or file manager would lead to the discovery of the other `.class` files as well.

### `java.lang.Object` class

Here, `java` is the root package, `lang` is the sub-package and `Object` is the .java `file`/`class`.

Every class in Java is directly or indirectly derived from the `Object` class, henceforth it is a child of the `Object` class. 

If a class does not extend any other class then it is a direct child class of `Object` and if extends another class then it is indirectly derived. 

Therefore the `Object` class methods are available to all Java classes.

Note: `Object` class acts as a root of inheritance hierarchy in any java program.

### Creating an Object of a Class

- In C++, creating an object was simple as we just had to specify the class type followed by the name of the object to be created and parentheses, either containing no arguments (Default Constructor) or a specific number of arguments (Parameterized Constructor).
  ```cpp
  class className {
    // Body
  };
  className objectName();
  ```

- In Java, it is somewhat similar where we specify the class name, followed by the object name and then we use the assignment operator (`=`) along with the constructor of the class.
  ```java
  ClassName {
    // Body
  }
  
  ClassName ObjectName = new ClassName();
  ```

### Wrapper Classes in Java

A Wrapper class is a class whose object wraps or contains primitive data types. 

When we create an object of a wrapper class, it contains a field and in this field, we can store primitive data types. 

In other words, we can wrap a primitive value using a wrapper class object built for that specific primitive data type.

#### Need of Wrapper Classes

- They convert primitive data types into objects.   
  
  Objects are needed if we wish to modify the arguments passed into a method. This is because primitive types are passed by value in Java.

- The classes in `java.util` package handles only objects and hence wrapper classes help in this case also.

### `java.lang.String` class

- `charAt()`
- `trim()`

### `java.util.Random` class

```java
Random randomObject = new Random();
```
#### `nextInt()` method

This method gives ANY random integer.

```java
System.out.println(randomObject.nextInt()); 
```

We can limit the upper bound of the range for selecting the random integer like so:

```java
System.out.println(randomObject.nextInt(20));
```

This gives a random integer from 0 upto but not including 20.

#### `doubles()`, `ints()` and `longs()`  method

These method return [Streams](#streams-javautilstream) of different data-types.

```java
int[] integer = randomObject.ints(2, 56, 74).toArray();
double[] integer = randomObject.doubles(2, 2.5, 7.0).toArray();
long[] integer = randomObject.longs(2, 3123156, 4566474).toArray();
```

- The first parameter gives the stream size
- The second one the start of the range
- The third one the upper bound

The [`toArray()`](#converting-streams-to-arrays--toarray) method converts the `IntStream`, `LongStream`, `DoubleStream` to arrays.

### `java.lang.Math` class

Note that `java.lang` package is imported by-default. 


- `ceil` : x is rounded up to its nearest integer. This integer is returned as a double value.
  ```java
  System.out.println(Math.ceil(7.5));
  ```
- `floor` :  x is rounded down to its nearest integer. This integer is returned as a double value.
  ```java
  System.out.println(Math.floor(7.5));
  ```
- `PI` : Gives us the value for Pi.
  ```java
  System.out.println(Math.PI);
  ```

#### `Math.random()`

The `java.lang.Math.random()` method returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0 

#### Getting a random floating-point number between 2 bounds using `Math`

```java
int a = 10;
int b = 10;
double randomFloat =  a + Math.random() * b;
```
This gives us ANY random number between 10 (a) and 20 (a+b), excluding 20 (a+b).

#### Getting a random integer between 2 bounds using `Math`

```java
int randomInt = Math.ceil(Math.random() * 20);
```

As we know `Math.random()` gives a random floating-point number between 0 and 1, excluding 1. Multiplying that by 20 increases that range to 0-20. excluding 20.

`Math.ceil()` rounds numbers upto the nearest integer. So numbers from 0-19.99... will be rounded up to the nearest integer, effectively taking our random range from 0-20 (only integers).

# Data Types in Java

## Primitive Data Types in Java

### `int`

For improved readability, we can add underscores to represent commas in larger integer values. The underscores can be placed as required since there is no format for these.`
```java
int integer1 = 234_000_000;
int integer2 = 2_3__4
```

### `byte`

byte datatype can store values from -128 to 127.

If we try to store a value out of that string, for example 128, we will get a warning about "possible lossy conversion" unless we [typecast](#typecasting-in-java) it.

If we try to perform the following type casting:
```java
byte byteValue = (byte)(128);
byte byteValue = (byte)(129);
byte byteValue = (byte)(130);
```
It will start from the bottom of the range of the byte data type, which is `-128`, then `-127`, then `-126` etc.

### `char`

`char` is a primitive type that represents a single 16 bit [Unicode](#what-is-unicode) character.

Although using [ASCII](#difference-between-ascii-and-unicode) logic works in same cases like:
```java
int integer = 65; // This is 41 in hexadecimal.
char character = (char)(integer);
System.out.println(character);
```

Output:
```
A
```

But, internally Java uses [Unicode](#what-is-unicode), which uses hexadecimal numbers to represent characters. 

So, `A` would be written as `\u0041` in [Unicode](#what-is-unicode), where `\u` is the Escape Sequence for [Unicode](#what-is-unicode).

#### Default Initialization Value for `char`

If suppose we create a reference variable which is an array of characters and then we assign an object to it in the following manner:

```java
char[] charArray;
charArray = new char[3];
```

And then we try to print one of the characters of the array, we will be shown an unknown character, which will have a value of `\u0000`, which is the **null** character in [Unicode](#what-is-unicode).

#### What is Unicode?

Unicode is an encoding for textual characters which is able to represent characters from many different languages from around the world.

#### Difference between ASCII and Unicode

The main difference between ASCII and Unicode is that: 
- ASCII represents lowercase letters (a-z), uppercase letters (A-Z), digits (0-9) and symbols such as punctuation marks. 
  
  It supports only 128 characters and uses 7 bits to represent a character.
- Unicode represents letters of English, Arabic, Greek etc., mathematical symbols, historical scripts, and emoji covering a wide range of characters than ASCII.
  
  It uses 8, 16 or 32 bits to represent a character depending on the encoding type.

## Non-Primitive data types in Java

Non-primitive types are created by the programmer and is not defined by Java (except for String). 

Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot. 

A primitive type always has a value, while non-primitive types can be **null**.

### `java.lang.String`

In java, strings are immutable, which saves memory. Once created in memory, it will be available forever.

Even if its reference variable is made to point to a different string, the string will stay in memory. 

When another reference variable is assigned the same string value during the same runtime, it will point to the same string object.

### `java.lang.Character`

`Character` is a [wrapper class](#wrapper-classes-in-java) that allows us to use [`char`](#char) primitive concept in OOP.

It has some built-in methods that the `char` primitive data type doesn't have. 

Example is given below.

```java
Character charInstance = 'a'; 
System.out.println(Character.isDigit(charInstance));
```

This method returns a boolean value depending on whether the given character is a digit or not.

### `java.lang.Double`

`Double` is a [wrapper class](#wrapper-classes-in-java) for the primitive type **double** which contains several methods to effectively deal with a double value like converting it to a string representation, and vice-versa.

#### Infinity in Java

The Double class in Java supports infinity. You can implement positive infinity or negative infinity.

The syntax for it is the following:
```java
double posInf = Double.POSITIVE_INFINITY;
double negInf = Double.NEGATIVE_INFINITY;
```

### Arrays

We can create an array in Java using the following syntax:
```java
dataType[size] arrayName;
```
- `dataType` - it can be primitive data types like `int`, `char`, `double`, `byte`, etc. or Java objects.
- `size` - We need to specify a size for the array when if we are just declaring the array.

  In the case where we declare and initialize the array at the same time, we should NOT specify a size for the array. For example
- `arrayName` - it is an identifier

#### Declaring, Creating & Initializing an Array

- DECLARING the Array reference variable.

  ```java
  int[] intArray; 
  ```

- CREATING the array OBJECT and assigning it to the reference variable `intArray`. All elements are **intialized** with value '0'.

  ```java
  intArray = new int[5]; 
  ```

  Notice how the format for object creation is similar to other classes like `Scanner` and `Random` in Java.

- INITIALIZING the array indices.

  ```java
  for(int index = 0; index < 2; index++) { 
      intArray[index] = (int)(Math.random() * 100);
  }
  ```

#### Specifying the number of elements in an Array

In order to define the number of elements that an array can hold, we have to allocate memory for the array in Java. For example,
```java
// declare an array
double[] data;

// allocate memory
data = new double[10];
```

Or instead of explicitly allocating memory for an array, we can also assign the array a value.
```java
double[] data = {1, 2, 3, 4};
```

#### Printing an Array `java.util.Arrays.toString(Object[] a)`

This method returns a string representation of the contents of the specified Object array. 

If the array contains other arrays as elements, they are converted to strings by the `Object.toString()` method inherited from Object, which describes their identities rather than their contents.

```java
int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr))
```

We use the `toString` method of `Array` class to convert the array into a `String` to print an array because `prinln` method doesn't take arrays as arguments.

## Streams (`java.util.stream`)

A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

The features of Java stream are –

- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

### Converting Streams to Arrays : `toArray()`

`Stream` provides `toArray()` method that returns an array containing the elements of the stream in the form of Object array.

Syntax:
```java

int[] integer = randomObject.ints(2, 56, 74).toArray();

```

The [`ints()`](#doubles-ints-and-longs--method) method returns an `IntStream` containing a stream of random integers, depending upon the arguments provided to [`ints()`](#doubles-ints-and-longs--method).

## Type-casting in Java (Forcing Lossy Conversions)

Java is quite persistent with warnings regarding "possible lossy conversions" in the case of IMPLICIT type conversion. 

In order to force conversions that might be lossy, we can use EXPLICIT type conversion or Type Casting.

Note that some conversions are not possible even using typecasting, such as `int` to `boolean`.

See [TypeCasting.java](JavaProjects/MasterProject/src/com/rohan/TypeCasting.java) for examples.

## Automatic Type Conversion in Expressions in Java

While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression value will be promoted. Some conditions for type promotion are:
- Java automatically promotes each `byte`, `short` or `char` to `int` when evaluating an expression. 
  
  This is the bare minimum since it is possible that the multiplication of two bytes is out of the range of `byte` datatype.   

  Note that for division, there is no automatic type conversion to a floating point value if no operand is a floating point number. This will result in truncation of values after the decimal. 
- If one operand is `long`, `float` or `double`, the whole expression is promoted to `long`, `float` or `double` respectively.

Let us take a short example to understand **this**:
```java
byte a = 40;
byte b = 50;
double c = 10.0 + a / b; 
```
Here, each `byte` is automatically promoted to `int` during the evaluation of this expression. 

If we had tried a similar operation in C/CPP, we would have to type-cast each value into an `int` before performing the operation.

## Brackets & Operator Precedence

It is import to understand that brackets and operator precedence also matter in expression evaluation. 

If suppose we have 2 expressions with datatypes like this:
```java
1 float + int / int
2 float + (int + int)
```
- In the first operation, since the precedence of division is higher, `int`/`int` will be performed before the upgradation to `float` so some part of the result of the division operation may be lost.
- In the second operation, even though the precedence of operators is same, brackets are around the two `int` values so they will be added without upgradation to `float`.

# Conditional and Looping Statements

## if-else statements

`int` to `boolean` type conversion is not possible in Java.
So, we can't use the following syntax:
```java
if(1) {
  //...
}
else {
  //...
}
```

## `for-each` loop (looping through Array elements)

This is also known as an enhanced for loop.

The syntax of the Java for-each loop is:
```java
for(dataType item : array) {
    ...
}
```
Here,

- `dataType` - the data type of the array/collection
- `item` - each item of array/collection is assigned to this variable
- `array` - an array or a collection

## switch-case

Switch statements in Java can take case values in numerical values (`byte`, `short`, `int` etc, where `char` datatype comes under `int` as well) and `String` as well.
    
It also has a `default` case for an invalid input.
    
The datatype of the input of the switch expression and the cases should be same.

Example of a switch-case statement:
```java
public static void main(String[] args) {
    String month = "jan";
    
    switch(month) {
        case "jan":
            System.out.println("This is January");
            break;
        case "feb":
            System.out.println("This is February");
            break;
        case "mar":
            System.out.println("This is March");
            break;
        default:
            System.out.println("No valid month string");
            break;
    }
}
```

# Taking Input in Java

We can make use of the `Scanner` class present in the `java.util` package.

The `Scanner` class reads an entire line and divides the line into tokens. **Tokens** are small elements that have some meaning to the Java compiler. 

For example, Suppose there is an input string: How are you.
In this case, the scanner object will read the entire line and divides the string into tokens: `“How”`, `“are”` and `“you”`. 

The object then iterates over each token and reads each token using its different methods.

Note that taking input using a method of the `Scanner` class automatically adds a new line after getting the input.

Since these methods aren't `static`, we need to create an object of the `Scanner` class in order to use them. 
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scannerObject = new Scanner(System.in);
    }
}
```
The method we used here to create the object `scannerObject` can be read about [above](#creating-an-object-of-a-class).

In a sense, we are creating an object the class `Scanner` and passing the `System.in` stream to it for scanning/reading input. 

So when we use methods on the created object, it will take a look at the standard input stream.

We may pass an object of class `File` if we want to read input from a file.

## Taking input of `int`

```java
int integer = scannerObject.nextInt();
```
The `java.util.Scanner.nextInt()` method is used to scan the next token of the input as an `int`.

## Taking input of `String`

### Taking input of one word

```java
String oneWord = scannerObject.next();
```
The `java.util.Scanner.next()` method finds and returns the next complete token from the current scanner. 

A complete token is preceded and followed by input that matches the delimiter pattern.

### Taking input of multiple words

```java
String multiWord = scannerObject.nextLine();
```
The `java.util.Scanner.nextLine()` method scans from the current position until it finds a line separator delimiter (for example, `\n`). 

The method returns the String from the current position to the end of the line.

## Taking input of one character (`char`)
```java
char character = scannerObject.next().charAt(0);
```

This helps us take input of a character as:
- next() takes the next word.
- charAt() is a method the String class present in `java.lang.String`. It takes the character at a specific index of a string.

## Checking if input stream still has data left

```java
Scanner scannerObject = new Scanner(System.in);
scannerObject.hasNext(); 
```
This returns a boolean value of true if this scanner has more data to be read.

## [Special cases while taking input shown practically](./JavaProjects/MasterProject/src/com/basics/TakingInput.java)

# Functions in Java

## Return values

- Any method declared `void` doesn't return a value. It does not need to contain a return statement, but it may do so. 

  In such a case, a return statement can be used to branch out of a control flow block and exit the method and is simply used like this:
  ```java
  return;
  ```

  If you try to return a value from a method that is declared void, you will get a compiler error.

- On the other hand, any method that is NOT declared `void` must contain a return statement with a corresponding return value, like this:

  ```java
  return returnValue;
  ```

  The data type of the return value must match the method's declared return type; you can't return an integer value from a method declared to return a boolean.

## No pass-by-reference

There is no pass-by-reference in Java, only pass-by-value.
```java
public class Main {
  public static void main(String[] args) {
    String name = "Rohan";
    changename(name);
  }

  public void changename(String naam) {
    naam = "Rahul";
  }
}
```
In this code, the first reference variable is `name` which points to the object "Rohan". 

When the `changename()` method is called, another reference variable `naam` is created, which points to the same object.

When we make the `naam` reference variable point to "Rahul", it doesn't change the value of what the original reference variable `name` is pointing to.

Meaning the object was passed by value to the function, and not by reference.

This is not pass-by-reference, this is pass-by-copy-of-the-value-of-the-reference

## References in Modern Languages

In modern languages, variables tend to be of "reference types" (another concept invented later than "pass by reference" and inspired by it), i.e. the actual object data is stored separately somewhere (usually, on the heap), and only "references" to it are ever held in variables and passed as parameters.

Passing such a reference (technically SAME as passing the address, like in C, where we passed the value held by a pointer) falls under pass-by-value because a variable's value is technically the reference itself, not the referred object.

However, the net effect on the program can be the same as either pass-by-value or pass-by-reference:

- If a reference is just taken from a caller's variable and passed as an argument, this has the same effect as pass-by-reference: if the referred object is mutated in the callee, the caller will see the change.
  
  This is what happens with `Array` variables in Java.

- However, if a variable holding this reference is reassigned, it will stop pointing to that object, so any further operations on this variable will instead affect whatever it is pointing to now.
- To have the same effect as pass-by-value, a copy of the object is made at some point. Options include:
  - The caller can just make a private copy before the call and give the callee a reference to that instead.
  - In some languages, some object types are "immutable": any operation on them that seems to alter the value actually creates a completely new object without affecting the original one. 
   
    So, passing an object of such a type as an argument always has the effect of pass-by-value: a copy for the callee will be made automatically if and when it needs a change, and the caller's object will never be affected.

    This is what happens with `String` variables in Java.

## Java NOT having pointers

C/CPP have plenty of issues relating to pointers and storing addresses directly in variables which can be read about [here](https://stackoverflow.com/questions/2629357/does-java-have-pointers).

Java side steps all of these issues by returning a reference. 

A reference does not refer to any location in memory; Java maintains an internal **"reference to pointer"** table (in some implementations of JVM). This table takes the reference and returns the data associated with it, wherever that data may reside in memory. 

This slows down code execution, because two lookups are done for each "dereferencing", one lookup in the reference table, one in the machine's memory.

A big advantage of Java using references is that the memory can be moved around without breaking the would-be pointer addresses. 

In a C program, if you move data into a new memory location, it is very difficult to know whether some other part of the program has a pointer to the data. Should a stale pointer be dereferenced after the memory is moved, the program will be accessing corrupt data, and typically a crash will be shortcoming.

Ability to move the memory around in a running program allows programs to easily recycle memory. Any program which doesn't need chunks of memory can release the unused memory, but this creates memory holes of unused memory in between chunks of used memory. 

Internally computers use pages of memory, which are quite large. If a sparsely used page of memory could have the few used bits moved into another page, then a page of memory can be freed. 

This increases the density of data to memory, improving cache performance. Sometimes this translates into performance improvements that can be quite dramatic.

Java's Garbage Collector takes advantage of the use of references by temporarily blocking access to the data for a set of references. During that blockage of access, it moves the data around (to compact it). After the blockage, the reference to address table has the new memory addresses. Since the "functional" layer of the code never knew the addresses in the first place, this operation will not break a running Java program.

# TODO 

- Cancellation Errors

(Demonstrate cancellation errors) A cancellation error occurs when you are manipulating a very large number with a very small number. 

The large number may cancel out the smaller number. For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain more accurate results, carefully select the order of computation. 

For example, in computing the following series, you will obtain more accurate results by computing from right to left rather than from left to right:

1 + 1/2 + 1/3 + ... + 1/


- String to Integer & Integer to String conversion 

```java
  int intValue = Integer.parseInt("23"); 
        // string to integer conversion
  String stringValue = String.valueOf(1); 
        // integer to string conversion
```
- Equality of string objects and primitive strings in java

```java
public static void main(String[] args) {
  String string1 = "vit"; //primitive data type
  String string2 = "vit"; // primitive data type
  String string3 = new String("vit"); // string object

  if(string1 == string2) {
      System.out.println("string1 equal to string2");
  };

  if(string1 != string3) {
  // string primitive data types and objects can be compared using the equals method
      System.out.println("string1 not equal to string3");
  };
}
```