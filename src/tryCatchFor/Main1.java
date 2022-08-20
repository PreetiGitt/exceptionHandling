package tryCatchFor;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a Number ");
                int var = in.nextInt();
                System.out.println(var);
            }
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        System.out.println("hello");
    }
}
