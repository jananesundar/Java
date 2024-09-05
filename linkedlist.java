import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int slow = 0;
        int fast = 0;
        while (fast < list.size() && fast + 1 < list.size()) {
            slow++;
            fast += 2;
        }
        if (fast==slow ) {
            System.out.println(list.get(slow));
        } else {
            System.out.println("No middle element found"); 
        }
    }
}
