class count{
    public static void main(String[] args) {
       String str="Hello World".toUpperCase();
       int c=0;
       int v=0;
       for(char ch:str.toCharArray()){
        if(Character.isLetter(ch)){
            if("AEIOU".indexOf(ch)!=-1){
                v++;
            }
            else{
                c++;
            }
        }
       }
System.out.println(" Vowels "+v+" Consonents "+c);
    }
}