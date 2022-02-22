public class NonStaticDoesNotWorkInStatic {
    public static void main(String[] args) {
        Abc.show();
       // Abc.i;
        Abc obj =new Abc();
        obj.i=10;
        System.out.println(Pqr.p);
        Pqr obj2=new Pqr();
        obj2.Show();
        System.out.println(obj2);

    }
}
class Abc{
    int i=9;
    public static void show()
    {
        System.out.println("Hi there....");

    }
}
class Pqr{
    static int p=0;
    public void Show(){
        System.out.println(Pqr.p++);
    }

}