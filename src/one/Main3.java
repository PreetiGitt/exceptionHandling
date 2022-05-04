package one;

public class Main3 {
    public static void main(String[] args) {
       try {
           System.out.println(args[0]);
       }
       // Handling the wrong Exception
       catch (ArithmeticException e) {
           System.out.println(e);
       }
        System.out.println("hello");
    }
}
