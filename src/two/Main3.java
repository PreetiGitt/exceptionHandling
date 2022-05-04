package two;

public class Main3 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);//ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
