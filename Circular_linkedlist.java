class Circular_linkedlist {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    void add_last(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new_node;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }

    void add_first(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new_node;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
            head = new_node;
        }
    }
    void add_index(int val,int index){
        Node temp=head;
        if(index==0){
            add_first(val);
        }
        else{
            Node new_node=new Node(val);
            while(index>1 && temp.next!=head){
                temp=temp.next;
                index--;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }

    void delete_first() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
            }
        }
    }

    void delete_last() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                temp.next = head;
            }
        }
    }

    void display() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println(temp.data);  
        }
    }

    public static void main(String args[]) {
        Circular_linkedlist li = new Circular_linkedlist();
        li.add_last(1);
        li.add_last(2);
        li.add_last(3);
        li.add_last(4);
        li.display();
        li.add_index(5,10);
        li.display();
    }
}
