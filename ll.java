public class ll {
    static class Node{
        int data;
        Node next;
        Node(int data){
         this.data=data;
         this.next=null;
        }
    }
    static Node head=new Node(1);
   static void print(Node temp){
    if(temp==null){
        System.out.println("List is empty");
        return;

    }
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("");
}
static void AddAtLast(Node temp,int data){
    Node newNode = new Node(data);
    if(temp == null)
    {
            temp = newNode;
            return;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
    

}
static void AddAtFirst(Node head,int data){
    Node newNode = new Node(data);
    
    if(head == null)
    {
            head = newNode;
            
            return;
    }
    newNode.next=head;
    head=newNode;
    
}
static void AddAtPosition(Node temp,int pos,int data){
    Node newNode = new Node(data);
    if(temp == null)
    {
            temp = newNode;
            return;
    }
    Node prev=null;
    int t=1;
    while(t<pos){
        prev=temp;
        temp=temp.next;
        
        t++;
    }
    newNode.next=prev.next;
    prev.next=newNode;
}
static void deleteAtPosition(Node temp,int pos){
    if(temp == null) {
        System.out.println("List is empty");
        return;
    }
    if(pos == 1) {
        temp = temp.next;
        return;
    }
    Node prev = null;
    int t=1;
    while(t<pos) {
        prev = temp;
        temp = temp.next;
        t++;
    }
    prev.next = temp.next;
}
    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;

        
        print(head);
        AddAtFirst(head,0);
        print(head);
        AddAtLast(head,5);
        print(head);
        AddAtPosition(head, 5, 4);
        print(head);
        deleteAtPosition(head, 4);
        print(head);
    }
    
}
