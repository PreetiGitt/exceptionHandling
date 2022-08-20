package tryWidResources;
class Fruit{
    void taste(){
        System.out.println("sweet");
    }
}
public class Three {
    public static void main(String[] args) {
      Fruit f1=new Fruit();
      f1.taste();
      Fruit f2=null;
      f2.taste();
        Fruit f3=new Fruit();
        f3.taste();
    }
}
