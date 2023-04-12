public class ll2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
         this.data=data;
         this.next=null;
        }
    }
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
    static Node createList(int[] elements) {
        Node head = null;
        Node tail = null;

        for (int element : elements) {
            Node newNode = new Node(element);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }
    public static void main(String[] args){
        
        int[] elements = {1, 5, 7, 3, 8, 2, 3};
        Node head = createList(elements);
        print(head);
        Node temp=head;
        int count=1;
        while(temp.data!=7){
            temp=temp.next;
            count++;
        }
        System.out.println(count);

    }
    
    
}
