public class Method_Overloaded {
    public static void main(String[] args) {
        int x=10,y=100;
        int c=add(x,y);
        System.out.println(c);
    }
    static int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }
}
