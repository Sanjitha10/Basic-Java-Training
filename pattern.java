// class pattern{
//     public static void main(String[] args){

        // for(int i=0;i<5;i++){
        //     for(int j=0;j<=i;j++){
        //     if(i==0&&i==4){
        //         System.out.println(" * ");
        //     }
        //         System.out.print(" * ");
        //     }
        //     System.out.println("");
        // }



    //     for (int i=0; i<5; i++) {
    //         System.out.print(" * ");
    //     }
    //     System.out.println("");
    //     for(int i=0;i<1;i++){
    //         for (int j = i; j < 1; j++) {
    //              System.out.println(" * ");   
    //         }
    //     }
    //     for (int i = 0; i < 5; i++) {
    //         System.out.print(" * ");
    //     }
    //      System.out.println("");
    //     for (int i = 4; i <=4; i++) {
    //         for (int j=i;j<=4;j++) {
    //       System.out.print(" * ");  
    //     }
    //     }
    // System.out.println("");
    //     for (int i = 0; i < 5; i++) {
    //         System.out.print(" * ");
    //     }
    //   for (int i = 0; i < 12; i++) {
        // for (int j = 0; j < 3; j++) {
            // if((i==0 && j==1)||(i==1 && j==1)){
            // System.out.print(" * ");
            // }
            // else{
            // System.out.print(" * ");
            // }
            // }
    //     for (int i = 0; i < 12; i++) {
    //         System.out.print(" * ");
    //     }
    //     if(i==0 && j==1){
    //         for(int i=0;i<3;i++){
    //             for (int j=0;j<3;j++){
                    
    //             }
    //         }
    //     }
    //     }
    // }

import java.util.*;
class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int k=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}