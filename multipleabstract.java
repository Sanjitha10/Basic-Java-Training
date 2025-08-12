// class Parent1{
//     int X=10;
//     void parent1method(){
//         System.out.println("Parent1");
//     }
//     }
//     class Parent2{
//         int Y=20;
//         void parent2method(){
//             System.out.println("Parent2");
//         }
//     }
//     public class Child extends Parent1,Parent2{
//         int Z=30;
//         public void childmethod(){
//             System.out.println("Child");
//         }
//     }
//     public class multipleabstract{
//         public static void main(String[] args) {
//             Child c=new Child();
//             c.childmethod();
//             c.parent1method();
//             c.parent2method();
//             }
//     }



interface Parent1{
    int X=10;
    default void parent1method(){
        System.out.println("Parent1");
    }
    }
    interface Parent2{
        int Y=20;
        default void parent2method(){
            System.out.println("Parent2");
        }
    }
    class Child implements Parent1,Parent2{
        int Z=30;
        public void childmethod(){
            System.out.println("Child");
        }
    }
    public class multipleabstract{
        public static void main(String[] args) {
            Child c=new Child();
            c.childmethod();
            c.parent1method();
            c.parent2method();
            }
    }