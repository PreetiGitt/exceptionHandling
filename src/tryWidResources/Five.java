package tryWidResources;
class Mango implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Mango got closed");
    }
}
public class Five {
    public static void main(String[] args) throws Exception{
        try(Mango m1=new Mango()) {
            System.out.println("main thread");
            System.out.println(args[0]);
            System.out.println("after Exception");
        }
    }
}
