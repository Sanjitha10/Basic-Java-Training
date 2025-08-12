
// import java.util.*;
// class Coins{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count = 0;
//         while(n>0){
//             // count++;
//             n>>=1;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

import java.util.*;
class Coins{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        while(n>0){
            if((n&1)==1){
            count++;
            }
            n>>=1;
        }
        System.out.println(count);
    }
}