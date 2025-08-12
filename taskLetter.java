
import java.util.Scanner;
class taskLetter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(char ch1:str.toCharArray()){
            if(ch1==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}