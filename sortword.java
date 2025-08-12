
import java.util.*;

class sortword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char[] ch1=str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);//it is one method
        // System.out.prinln(new String(arr));//it is one method
        // for(char ch1:arr){
        //     System.out.println(ch1);  //this is one method      }
    }
}