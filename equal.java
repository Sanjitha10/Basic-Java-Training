import java.util.*;
class equal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.compareTo(str2));
    }
}