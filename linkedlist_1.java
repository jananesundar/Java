import java.util.Scanner;
class linkedlist_1{
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next=null;
        }
    }
        void add(int val){
            Node new_node = new Node(val);
            if(head==null){
                head=new_node;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new_node;
            }
        }
        void add_first(int val){
            Node new_node=new Node(val);
            new_node.next=head;
            head=new_node;
        }
        void add_index(int val,int index){
            Node temp=head;
            if(index==0){
                add_first(val);
            }
            else{
                Node new_node=new Node(val);
                while(index>1 && temp.next!=null){
                    temp=temp.next;
                    index--;
                }
                new_node.next=temp.next;
                temp.next=new_node;
            }
        }
        void insert_mid(int val){
            Node newnode = new Node(val);
                if(head==null){
                    head=newnode;
                }
                else{
                    Node fast=head;
                    Node slow=head;
                    while(fast.next!=null && fast.next.next!=null){
                        slow=slow.next;
                        fast=fast.next.next;
                    }
                    newnode.next=slow.next;
                    slow.next=newnode;
                }
        }
        void delete_first(){
            if(head!=null){
                head=head.next;
            }
        }
        void delete_last(){
            if(head!=null){
                Node temp=head;
                if(head.next==null){
                    delete_first();
                }
                while(temp.next!=null && temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
        void delete(){
            if(head!=null){
                Node temp=head;
                while(temp.next!=null&&temp!=null){
                    temp.next=temp.next.next;
                    temp=temp.next;
                }
            }
        }
        void removedup() {
            Node temp = head;
            while (temp!= null && temp.next != null) {
                if(temp.data==temp.next.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
            }
        }

        void remove_dup() {
            Node i = head;
            Node j = i.next;
            while (i!= null && i.next!=null) {
                while(j!=null){
                    if(i.data==j.next.data){
                        j.next=j.next.next;
                        i=i.next;
                    }
                    else{
                        j=j.next;
                    }
                    if(j.next==null){
                        j.next=null;
                    }
                }
            }
            }
        
        
        void display(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count=count+1;
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
            System.out.println(" null");
            System.out.println(count);
        }
        public static void main(String args[]){
            //Scanner sc=new Scanner(System.in);
            //int k=0;
            linkedlist_1 li=new linkedlist_1();
            /*while(true){
                k=sc.nextInt();
                if(k==-1){
                    break;
                }
                li.add_first(k);
            }
            li.display();*/
            li.add(1);
            li.add(5);
            li.add(6);
            li.add(5);
            li.display();
            li.remove_dup();;
            li.display();
        }
}

