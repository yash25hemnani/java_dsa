package com.basics;

// Every file that ends with .java is class.
// So this file must contain a class named main
// Another naming convention is starting a variable with a capital letter means its a class
// Whenever you name a file say, Main.java, the class name will always be a public class
// Public means, it can be accessed from anywhere

public class Main {
    // main functions is a keyword, it's the entry point of the program.
    // Since main is the entry point, we must make it public so it is able to run from anywhere.
    // static is used because we want to run this main function without creating an object of the Main class. Since it is the entry point, we need it to run wihout creating an object.
    // static variables do not depend on object's creation.
    // void is the return type of the program.
    // String[] args - these are command line arguments, array of strings basically. Whatever you are giving in the command line, will be stored as a string in 'args' variable.

    // public static void main(String[] args) {
    //     System.out.println("Hello World");
    // }

    public static void main(String[] args) {
        System.out.println(args[0]);
        // javac Main.java
        // java Main MyInput
        // Output - MyInput
        // This input was stored in args.

    }
}

// To convert to byte code, in terminal use -  javac Main.java
// To run - java Main
// Output - Hello World