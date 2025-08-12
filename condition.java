//Condition Statement: Nested if statement;

// import java.util.Scanner;
// class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int grade=sc.nextInt();
//         if(grade>=90){
//             if(grade>=95){
//             System.out.println("O");
//             } 
//         else{
//             System.out.println("A+");
//         }
//         }
//         else{
//             System.out.println("A");
//         }    
//         }
// }



//Condition Statement:If-Else-If statement;

import java.util.Scanner;
class condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade=sc.nextInt();
        if(grade>=90){
            System.out.println("O");
            } 
        else if(grade>=80){
            System.out.println("A+");
        }
        else if(grade>=70){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }    
        }
}