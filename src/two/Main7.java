package two;

import java.io.PrintStream;

public class Main7 {
    public static void main(String[] args) {
    /*java.lang.NumberFormatException: For input string: "Radha",
       control  out of try at first occurrence of exception*/
        try{
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.println(num1/num2);
           // System.out.println("Radha"/ "Krishna");


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
/*
Input
1. 10/5
2. 10/0
3. Radha Krishna*/
