import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        // Specifying the type explicitly as Integer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(5, 60);
        System.out.println(list);
        System.out.println("Size : "+list.size());
        list.remove(2);
        System.out.println("Remove "+list);
        System.out.println(list.subList(1, 3));

        List<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.subList(1, 3));

       
    }
}

