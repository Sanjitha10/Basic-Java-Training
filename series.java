
import java.util.Scanner;

class series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=N;i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
        }
    }
}