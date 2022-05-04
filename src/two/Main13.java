package two;

public class Main13 {
    public static void main(String[] args) {

        try {

            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);

        }

            //Parent exception catch can not be followed by  subclass catch
        catch(RuntimeException exception){
            System.out.println(exception);
        }
       /* catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*/

        System.out.println("Hello");
    }
}
