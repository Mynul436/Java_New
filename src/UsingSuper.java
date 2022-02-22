public class UsingSuper {
    public static void main(String[] args) {
        Bb obj=new Bb();
        obj.shoe(5);
    }
}
class Aa{
    Aa()
    {
        System.out.println("In class A");
    }
}
class Bb extends Aa{
    private int x;//instance
    Bb()
    {
        System.out.println("In class B");
    }
    public void shoe(int x)//local
    {
        this.x=x;//current instance

        System.out.println("x is "+x);
    }
}