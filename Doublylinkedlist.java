public class Doublylinkedlist {
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }
    void add_first(int val){
        Node newnode =new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    void add_last(int val){
        Node newnode =new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    void add_index(int val,int index){
        Node newnode=new Node(val);
        if(index==0){
            add_first(val);
        }
        else{
            Node temp=head;
            while(index>1 && temp.next!=null){
                index--;
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    void delete_first(){
        if(head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                //head.prev.next=null;
                head.prev=null;
            }
        }
    }
    void delete_last(){
        if(head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next.prev=null;
                tail.next=null;
            }
        }
    }
    void delete_index(int index){
        if(index==0){
            delete_first();
        }
        else{
            if(head!=null){
                Node temp=head;
                while(index>1 && temp.next!=null){
                    index--;
                    temp=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=null;
                    if(temp.next.next!=null){
                        temp.next.next.prev=temp;
                        temp.next=temp.next.next;
                    }
                    else{
                        temp.next.prev=null;
                        temp.next=temp.next.next;
                        tail=temp;
                    }
                }
            }
        }
    }
    void reveser(){
        Node temp=tail;
        while(temp.prev!=null){
            System.out.print(temp.data+" <=>");
            temp=temp.prev;
        }
        System.out.print(temp.data);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Doublylinkedlist d = new Doublylinkedlist();
        d.add_last(50);
        d.add_last(60);
        d.add_last(70);
        d.add_last(80);
        d.add_first(40);
        d.add_index(10,1);
        d.display();
        d.delete_index(3);
        d.display();
        d.reveser();

    }
}
