class Library{
    // Scanner sc = new Scanner(System.in);
    // String article=sc.nextLine();
    // String book=sc.nextLine();
    // String newspaper=sc.nextLine();
    String article="Java Inheritance";
    String book="Java Inheritance Book";
    String newspaper="Java Inheritance Newspaper";
    void parentmethod(){
        System.out.println("This is Parent Method");
    }
    }
    class Article extends Library{
        void childmethod(){
            System.out.println(article);
        }
    }
    class Book extends Library{
        void childmethod1(){
            System.out.println(book);
        }
    }
    class Newspaper extends Library{
        void childmethod2(){
            System.out.println(newspaper);
        }
    }
    class Inheritance{
        public static void main(String[] args) {
            Article a=new Article();
            Book b=new Book();
            Newspaper n=new Newspaper();
            a.childmethod();
            b.childmethod1();
            n.childmethod2();
            a.parentmethod();
            b.parentmethod();
            n.parentmethod();
        }
    }