class Student{
    String a="apple";
    String b="banana";
    public String toString(){
        return a+b;
    }
}
class tostr{
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s);
    }
}