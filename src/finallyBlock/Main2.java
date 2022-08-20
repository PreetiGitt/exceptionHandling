package finallyBlock;

public class Main2 {
    public static void main(String[] args) {
        try {


            System.out.println("Simple");


        }// No Exception
       finally{
            // always executed
            System.out.println("finally");
        }


        System.out.println("Hello");

    }
}
