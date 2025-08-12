import java.util.*;
class Collection{
    public static void main(String[] args) {
        // Vector<Integer> arr=new Vector<>();
        // HashSet<Integer> arr=new HashSet<>();
        // ArrayList<Integer> arr=new ArrayList<>();
        // LinkedList<Integer> arr=new LinkedList<>();
        // Stack<Integer> arr=new Stack<>();
        Vector<Integer> arr=new Vector<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(50);
        arr.add(40);
        System.out.println(arr);
        arr.remove(0);//no remove in hashset
        System.out.println(arr);
    }
}
