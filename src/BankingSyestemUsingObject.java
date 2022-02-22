class Account

{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name=n;
        amount=amt;
    }
    //deposite method
    void deposite(float amt)
    {
        amount=amount+amt;
        System.out.println(amount+" deposited");
    }
    //withdeaw method
    void withdraw()
    {
        
    }

}



public class BankingSyestemUsingObject {
}
