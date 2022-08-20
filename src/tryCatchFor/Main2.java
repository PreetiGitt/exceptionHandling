package tryCatchFor;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter a Number ");
                int var = in.nextInt();
                System.out.println(" You Entered " + var);
            } catch (Exception e) {
                e.printStackTrace();
                in.nextLine();
                System.out.println("Enter only a Number please ");
                int var = in.nextInt();
                System.out.println(" You Entered " + var);
            }
        }
        System.out.println("hello");
    }
}
