
import java.util.Scanner;

class logical{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float cgpa=sc.nextFloat();
        int arier=sc.nextInt();
        if(cgpa>7.0 && arier==1){
        System.out.println("Eligible for Interview's");
        }
        else if(cgpa>7.5 && arier==0){
        System.out.println("Eligible for MNC's Company's");
        }
        else if((cgpa>=6.5 && cgpa<=7.0) && (arier==0 || arier==1)){
        System.out.println("Eligible");
        }
        else{
        System.out.println("Not Eligible for Company's");
        }
    }
}

//check the both cgpa and arier by logical operator.