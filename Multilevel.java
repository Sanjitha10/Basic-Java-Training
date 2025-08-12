class Grandparent{
    int X=10;
    void grandparentmethod(){
        System.out.println("GrandParent:" + X);
    }
    }
    class Parent extends Grandparent{
        int Y=20;
        void parentmethod(){
            System.out.println(X+Y +"Parent:");
        }
    }
    class Child extends Parent{
        int Z=30;
        void childmethod(){
            System.out.println(X+Y+Z +"Parent:");
        }
    }
    class Multilevel{
        public static void main(String[] args) {
            Child c=new Child();
            c.childmethod();
            c.parentmethod();
            c.grandparentmethod();
            }
    }