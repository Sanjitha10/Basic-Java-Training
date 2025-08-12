class Purpose{
    int X=10;
    Purpose(){
         System.out.println(X+"=Parent Method");
    }
}
class Purpose1 extends Purpose{
    int Y=10;
    Purpose1(){
        super();
        System.out.println(X+Y+"=Child Method");
    }
}
class Constructor{
    public static void main(String[] sanji){
        // new Purpose();
        new Purpose1();
    }
}

//constructor method in java at single inheritance;
//we can use super() to call parent class constructor in child class comstructor;
//if we dont assign super() default child class constructor calls parent class constructor;