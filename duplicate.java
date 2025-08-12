//for each method:

// class duplicate{
//     public static void main(String[] args) {
//         String str="Sanjitha";
//         String dup="";
//         for(char ch1:str.toCharArray()){
//            if(dup.indexOf(ch1)==-1){
//             dup+=ch1;
//         }
//         }
//         System.out.println(dup);
//     }
// }

//for loop method:

class duplicate{
    public static void main(String[] args) {
        String str="Sanjitha";
        String dup="";
        char[] ch1=str.toCharArray();
        for(int i=0;i<str.length();i++){
           if(dup.indexOf(ch1[i])==-1){
            dup+=ch1[i];
        }
        }
        System.out.println(dup);
    }
}