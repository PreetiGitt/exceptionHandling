package tryWidResources;

public class Six {
    public static void main(String[] args) throws Exception{
        try(Apple a1=new Apple();Mango m1=new Mango()) {
            System.out.println("main thread");
            System.out.println(args[0]);
            System.out.println("after Exception");
        }
    }
}
