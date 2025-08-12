class Purpose{
    void display(int roll,int age){
        System.out.println(roll + age+ " : My first Class method");
    }
    void display1(String name,String city){
        System.out.println(name + city+ " : My second Class method");
    }
    void display2(float cgpa,float mark){
        System.out.println(cgpa + mark+ " : My third Class method");
    }
    void display3(char c1,char c2){
        System.out.println(c1 + c2+ " : My fourth Class method");
    }
}
class Overload{
    public static void main(String[] args){
        Purpose obj=new Purpose();
        obj.display(142,19);
        obj.display1("Sanjitha","Sitheri");
        obj.display2(8.08f,90.0f);
        obj.display3('S','K');
    }
}

//overloading is one of the involving type is polymorphism in java