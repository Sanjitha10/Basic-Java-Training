// class Encapsulation{
//   // private String name="Terv Pro";
//    private String name;
//     public void setName(String setname){
//     // name="terv";
//     setname=name;
//     }
//     public String getName(){
//         return name;
//     }
// }
// class Encaps{
//     public static void main(String[] args) {
//         Encapsulation obj=new Encapsulation();
//         obj.setName("MEC");
//         System.out.println(obj.getName());
//     }
// }


class Encapsulation{
    private String name;
    public void setName(){
    name="terv";
    }
    public void getName(){
        System.out.println(name);
    }
}
class Encaps{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setName();
        obj.getName();
    }
}