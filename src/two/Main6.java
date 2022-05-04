package two;

public class Main6 {
    public static void main(String[] args) {
        // Bad Practice
        try{
            System.out.println("Try");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
