package two;

public class Main4 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);//ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
