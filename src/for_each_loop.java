import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        //String[] abc={"cat","dog","cow"};
        ArrayList<String> abc =new ArrayList<>();
        abc.add("cow");
        abc.add("dog");
        abc.add("cat");

        for(String i:abc)
        {

            System.out.println(i);

        }
    }
}
