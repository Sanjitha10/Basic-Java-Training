import java.util.Scanner;

class relational{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float cgpa=sc.nextFloat();
        if(cgpa>=7.0){
        System.out.println("Eligible for Interview's");
        }
        else{
        System.out.println("Not Eligible for Interview's");
        }
    }
}