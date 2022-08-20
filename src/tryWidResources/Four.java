package tryWidResources;
class Apple implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Apple got closed");
    }
}
public class Four {
    public static void main(String[] args) throws Exception{
     try(Apple a1=new Apple()) {
         System.out.println("main thread");
     }
     }
    }

