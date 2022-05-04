package one;

public class Main2 {
    public static void main(String[] args) {
       try {
           System.out.println(args[0]);
       }
       // Handling Exception
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
       }
        System.out.println("hello");
    }
}
