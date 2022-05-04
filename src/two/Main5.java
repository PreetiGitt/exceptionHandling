package two;

public class Main5 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=20;
            System.out.println(a/b);// No Exception
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
