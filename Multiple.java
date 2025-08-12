interface Parent1{
    int X=10;
    void parent1method();
}
interface Parent2{
    int Y=20;
    void parent2method();
}
class Child implements Parent1,Parent2{
    public void parent1method(){
        System.out.println(X);
    }
    public void parent2method(){
        System.out.println(Y);
    }
}
class Multiple{
    public static void main(String[] args){
        Child c=new Child();
        c.parent1method();
        c.parent2method();
    }
}