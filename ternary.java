//to find even or odd using ternary

// class ternary{
//     public static void main(String[] args) {
//         int a=10;
//         System.out.println(a%2==0 ? "a is Even":"b is Odd");  
//           }
// }


//postive or negative:

// class ternary{
//     public static void main(String[] args) {
//         int a=10;
//         System.out.println(a>0 ? "Positive":"Negative");  
//           }
// }


//whether eligible for vote or not

// class ternary{
//     public static void main(String[] args) {
//         int a=10;
//         System.out.println(a>=18 ? "Eligible":"Not Eligible");  
//           }
// }


//using three element then ind maximum number of three elements

// class ternary{
//     public static void main(String[] args) {
//         int a=10;
//         int b=5;
//         int c=15;
//         System.out.println(((a>b) && (a>c)) ? "a is max":((b>a) && (b>c)) ? "b is max":"c is max");  
//           }
// }


//to find negative or positive or zero using ternary operator

// class ternary{
//     public static void main(String[] args) {
//         int a=-1;
//         System.out.println((a>0) ? "Positive": (a<0) ? "Negative":"Zero");  
//           }
// }


// Using bitwise operator to find odd or even in ternary:

// class ternary{
//     public static void main(String[] args) {
//         int a=1;
//         System.out.println(((a&1)==0) ? "Even": "Odd");  
//           }
// }


//Odd or Even program done using input method:

import java.util.*;
class ternary{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt(); 
    System.out.println(((value%2)==0) ? "Even": "Odd");  
    }
}

