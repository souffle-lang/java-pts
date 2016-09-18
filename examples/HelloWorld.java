
public class HelloWorld {
    public static int sfield;
    public int field;
    public int foo() {
       HelloWorld x = new HelloWorld(); 
       x.field = 10; 
       sfield = 20;
       return x.foo();
    } 
    public int goo() { 
       int y = sfield; 
       return y;
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}

