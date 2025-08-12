//Switch case:

// import java.util.*;

// class stmtswitch{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int value = sc.nextInt();
//         int calculate = value%2;
//         switch(calculate){
//             case 0:
//             System.out.println("Even");
//             break;
//             case 1:
//             System.out.println("Odd");
//             break;
//             default:
//             System.out.println("Invalid");
//         }
//     }
// }


//find logic of the box by program
//Switch case:

// import java.util.*;

// class stmtswitch{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int value = sc.nextInt();
//         int calculate = value%8;
//         switch(calculate){
//             case 1:
//             System.out.println("Lower berth");
//             break;
//             case 2:
//             System.out.println("Middle berth");
//             break;
//             case 3:
//             System.out.println("Upper berth");
//             break;
//             case 4:
//             System.out.println("Upper berth");
//             break;
//             case 5:
//             System.out.println("Middle berth");
//             break;
//             case 6:
//             System.out.println("Lower berth");
//             break;
//             case 7:
//             System.out.println("Side Lower berth");
//             break;
//             case 0:
//             System.out.println("Side Upper berth");
//             break;
//             default:
//             System.out.println("Invalid");
//         }
//     }
// }

//Another method of above program:

import java.util.*;

class stmtswitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int calculate = value%8;
        switch(calculate){
            case 0:
            System.out.println("Side Upper berth");
            break;
            case 1:
            case 4:
            System.out.println("Lower berth");
            break;
            case 2:
            case 5:
            System.out.println("Middle berth");
            break;
            case 3:
            case 6:
            System.out.println("Upper berth");
            break;
            case 7:
            System.out.println("Side Lower berth");
            break;
            default:
            System.out.println("Invalid");
        }
    }
}