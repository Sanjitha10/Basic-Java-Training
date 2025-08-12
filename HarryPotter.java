class Library{
    String str="Harry Potter Part-1";
    void librarymethod(){
        System.out.println("Library");
    }
    }
    class BookPart extends Library{
        String str1="MagicStick";
        void bookpartmethod(){
            System.out.println("BookPart:" + str);
        }
    }
    class Paper extends BookPart{
        void papermethod(){
            System.out.println("Paper:" + str1);
        }
    }
    class HarryPotter{
        public static void main(String[] args) {
            Paper p=new Paper();
            p.papermethod();
            p.bookpartmethod();
            p.librarymethod();
            }
    }