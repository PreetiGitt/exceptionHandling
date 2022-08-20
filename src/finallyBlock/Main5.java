package finallyBlock;
class A{

    int one(){
        try {
            System.out.println("Inside Try");
            return 10;// stmt is ignored
        }
        finally{

            System.out.println("finally");
            return 20;//value returned
        }

    }
}
public class Main5 {
    public static void main(String[] args) {
        System.out.println("Radhika");
        A a1=new A();
        System.out.println(a1.one());


        System.out.println("Hello");

    }
}
