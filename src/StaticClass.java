
public class StaticClass {
    static int a=100;
    static void func(int arf){
        System.out.println("The value of static a is "+a);


    }

    public StaticClass() {
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        StaticClass.a = a;
    }

    public static void main(String[] args) {
        StaticClass.func(5);
    }

}
