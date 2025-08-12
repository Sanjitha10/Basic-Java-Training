//For Loop:

// class loop{
//     public static void main(String[] args) {
//         for(int i=1;i>0;i++)
//         System.out.println(i);
//     }
// }



// Do-While Loop:

// import java.util.*;
// class loop{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//         do { 
//             System.out.println("Natural Numbers:" + n);
//             n++;
//         } while (n<=10);
//     }
// }



//For-Each Loop:

// class loop{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50,60,70,80,90,100};
//         for(int n:arr){
//             System.out.println("Arrays:" + n);
//         }
//     }
// }



//Find Unit digit using While Loop:

// import java.util.*;
// class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         while(n>0){
//             int unit=n%10;
//             System.out.println(unit);
//             n/=10;
//         }
//     }
// }



//For-Each Loop using in input get method:

import java.util.*;
class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}