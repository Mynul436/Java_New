import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Munul");
        name.add("Islam");
        name.add("Akash");
        name.remove(2);
        name.clear();
        for(int i=0;i< name.size();i++)
        {

            System.out.println(name.get(i));

        }
        System.out.println("Its all clear!!");
    }
}
