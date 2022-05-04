package two;

public class Main2 {
    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
