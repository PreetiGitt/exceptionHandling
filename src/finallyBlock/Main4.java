package finallyBlock;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Radhika");
        System.exit(2); // JVM Terminates
        try {
            System.out.println("Inside Try");
        }
       finally{
            //Not Executed
            System.out.println("finally");
        }

        System.out.println("Hello");

    }
}
