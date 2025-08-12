class Main{
         public int a=20;
         int x=10;
        private int b=30;
        protected int c=40;
    void accessmodify(){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    }
    class Access{
    public static void main(String[] args){
        Main obj=new Main();
        obj.accessmodify();
        System.out.println(obj.x);
        System.out.println(obj.a);
        // System.out.println(b1);
        System.out.println(obj.c);
    }
    }