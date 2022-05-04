package two;

public class Main9 {
    public static void main(String[] args) {

        try {



        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("Hello");
    }
}
