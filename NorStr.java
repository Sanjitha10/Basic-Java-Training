class Student{
    int a=10;
    int b=20;
    public int add() {
        return a+b;
    }
}
    class NorStr{
        public static void main(String[] args) {
            Student s=new Student();
            System.out.println(s.add());
        }
    }
