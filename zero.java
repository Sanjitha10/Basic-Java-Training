
import java.util.Scanner;

class zero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=0;
            for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[f]=arr[i];
                f++;
            }
        }
        while(f<n){
            arr[f]=0;
            f++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        }
}