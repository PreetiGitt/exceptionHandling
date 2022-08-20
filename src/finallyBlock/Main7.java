package finallyBlock;
class C{

    int one(){
        try {
            System.out.println("Inside Try");
            int [] a={10,20};
            System.out.println(a[2]);

        }
        finally{

            System.out.println("finally");
            return 100;

        }

    }
}
public class Main7{
    public static void main(String[] args) {
        System.out.println("Radhika");
        C b1=new C();
        System.out.println(b1.one());


        System.out.println("Hello");

    }
}
