class Summa{
    String str="Hello";
    void display(){
        System.out.println("Sanjitha");
    }
    static String strname(){
        return "Selvam";
    }
}
class Instance{
    public static void main(String[] args) {
        Summa obj1=new Summa();
        System.out.println(obj1.str);
        obj1.display();
        System.out.println(obj1.strname());
    }
}

//this method belongs to instance of the class in java;