public class d_2_array {
    public static void main(String[] args) {
        String str[][] = new String[2][2];
        str[0][0]="Akash 0";
        str[0][1]="Akash 1";
        str[1][0]="Akash 2";
        str[1][1]="Akash 3";
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j< str.length;j++)
            {
                System.out.println(str[i][j]);
            }
        }
    }
}
