public class LinkedListExample1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class linkedlist{
        Node head;
        void insert(int value){
            Node newnode= new Node(value);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newnode;

        }
        void printlist(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insert(12);
        list.insert(32);
        list.insert(125);
        list.insert(127);

    }
    
}
