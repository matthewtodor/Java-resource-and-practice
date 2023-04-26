
// When declaring a class, ensure the filename is the exact same as the class being declared.

// The "public" keyword means that other classes can use this class. 
// classes are always PascalCased
public class HelloWorld{
    // the keyword "void" means that the function doesn't return anything
    public static void main(String[] args){
        // println is "print line", not "print In". Trailing semicolons are required when calling functions/methods
        System.out.println("Hello World!");
    }
}
// running javac HelloWorld.java will compile the code, creating a HelloWorld.class file
// running java HelloWorld will run the code via the HelloWorld.class file. You do not need to include the .class when calling the file 