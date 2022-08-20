package finallyBlock;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        try {
            System.out.println("Simple");
        }
       finally{
            // always executed ONLY if Exception occurs in try blocks, NOT outside it
            System.out.println("finally");
        }

        System.out.println("Hello");

    }
}
