package finallyBlock;
class D{

    void one(){
        try {
            System.out.println("Inside Try");
            int [] a={10,20};
            System.out.println(a[2]);

        }
        finally{

            System.out.println("finally");


        }

    }
}
public class Main8{
    public static void main(String[] args) {
        System.out.println("Radhika");
        D b1=new D();
        b1.one();
        System.out.println("end of progg.");



    }
}
