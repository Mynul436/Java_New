public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        //obj1.show();
        A a;
        a=obj2;
        a.show();

       // B obj2=new B();
    }

}
class A{
    public void show()
    {
        System.out.println("In const A");
    }

}
class B extends A{
    public void show()
    {
        System.out.println("In const B");
    }
}