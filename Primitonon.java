// class Primitonon{
//     public static void main(String[] args){
//         String s="12345";
//         int n=Integer.parseInt(s);
//         System.out.println(n);
//         }
// }



class Primitonon{
    public static void main(String[] args){
        String s="12345";
        int sum=0;
        int n=Integer.parseInt(s);
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println(sum);
        }
}
