package four;


public class Main1 {
    public static void main(String[] args) {
        try {

            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);


        }
        // Multi Catch Stmt.
        catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
