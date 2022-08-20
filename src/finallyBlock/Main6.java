package finallyBlock;
class B{

    int one(){
        try {
            System.out.println("Inside Try");
            return 10;
        }
        finally{

            System.out.println("finally");

        }

    }
}
public class Main6{
    public static void main(String[] args) {
        System.out.println("Radhika");
        B b1=new B();
        System.out.println(b1.one());


        System.out.println("Hello");

    }
}
