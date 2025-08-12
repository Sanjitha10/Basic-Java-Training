//how to change true as we using ""=="" this method:

// class literals{
//     public static void main(String[] args) {
//         String str1="";
//         String str2="Welcome to Muthayammal Engineering College";
//         String str3=str1;
//         System.out.println(str1==str3);
//     }
// }



// normal we use means we got like this:

class literals{
    public static void main(String[] args) {
        String str1="";
        String str2="Welcome to Muthayammal Engineering College";
        // String str3=str1;
        if(str1==str2){
        System.out.println(true);
        }
        else{
        System.out.println(false);
        }
    }
}
