package three;

public class Main3 {
    public static void main(String[] args) {

        try {

            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);

        }

            // Bad Practice
        catch(Throwable exception){
            System.out.println(exception);
        }

        System.out.println("Hello");
    }
}
