//using comapreTo method to sort of three strings:

// class sort{
//     public static void main(String[] args) {
//         String str1="Sneha";
//         String str2="Sanji";
//         String str3="Navi";
//         System.out.println(str1.compareTo(str3));
//         System.out.println(str2.compareTo(str3));
//     }
// }

//normal sort method:
import java.util.*;
class sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[3];
            for(int i=0;i<3;i++){
            str[i]=sc.nextLine();
        }
        Arrays.sort(str);
        for(String name:str){
        System.out.println(name);
        }
    }
}