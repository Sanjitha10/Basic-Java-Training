class Parent{
    int x=10;
    int c=5;
    void parent(){
        System.out.println("Parent Constructor ");
    }
}
class Child1 extends Parent{
    void child1(){
        System.out.println("Child1 Constructor:"+c);
    }
}
class Child2 extends Parent{
    void child2() {
        System.out.println("Child2 Constructor:"+x);
    }
}
interface Parent1{
    int y=20;
    void parent2();
}
interface Parent2{
    int z=30;
    void parent2();
}
class Children implements Parent1,Parent2{
    public void parent1(){
        System.out.println("Children Parent1:"+y);
    }
    public void parent2(){
        System.out.println("Children Parent2:"+z);
    }
}
class Grandparents{
    int b=500;
    void grandparents(){
        System.out.println("Grandparents Constructor");
    }
}
class Parents extends Grandparents{
    int a=100;
    void parents(){
        System.out.println("Parents Constructor:"+b);
    }
}
class Childs extends Parents{
    void childs(){
        System.out.println("Childs Constructor:"+(a+b));
    }
}
class Hybrid{
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.parent();
        c1.child1();
        c2.child2();
        Children c3=new Children();
        c3.parent1();
        c3.parent2();
        Childs c=new Childs();
        c.grandparents();
        c.parents();
        c.childs();
    }
}

