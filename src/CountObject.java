public class CountObject {
    public static void main(String[] args) {
        Abc1 ob1=new Abc1();
        Abc1 ob2=new Abc1();
        Abc1 ob3=new Abc1();
        Abc1 ob4=new Abc1();
        ob4.p1();

    }
}
class Abc1{
   static int i;
      Abc1(){
        i++;

    }
    public void p1(){
        System.out.println(i);

    }
}