package finallyBlock;

public class Main1 {
    public static void main(String[] args) {
        try {

            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);


        }
       finally{
            // always executed BEFORE Exception
            System.out.println("finally");
        }


        System.out.println("Hello");

    }
}
