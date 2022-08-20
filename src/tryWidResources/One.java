package tryWidResources;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int var=sc.nextInt();
            System.out.println("Value Entered is" +var);
        }
    }
}
