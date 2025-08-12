//This way is to prove string is immutable:

class inmutable{
    public static void main(String[] args) {
        String str=new String("Welcome");
        str.concat("Sanjitha");
        System.out.println(str);
    }
}
