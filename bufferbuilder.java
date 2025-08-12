
import java.util.*;

class bufferbuilder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        StringBuilder connect=new StringBuilder(str);
        connect.append(str1);
        System.out.println(connect);
            //  StringBuffer connnect=new StringBuffer(str);
            //connnect.append(str1);
    }
}