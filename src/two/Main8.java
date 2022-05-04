package two;

public class Main8 {
    public static void main(String[] args) {

        try{
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);
            // System.out.println("Radha"/ "Krishna");


        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
       /* Duplicate catch is not permitted
       catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }*/
        System.out.println("Hello");
    }
}
