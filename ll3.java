import java.util.*;

public class ll3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void input(Node temp, int data) {

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // int elements[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // elements[i] = sc.nextInt();
        // }
        // Node head=new Node(1);
        // for (int element : elements) {
        // Node newNode = new Node(element);
        // head = null;
        // Node tail = null;
        // if (head == null) {
        // head = newNode;
        // tail = newNode;

        // } else {
        // tail.next = newNode;
        // tail = newNode;
        // }

        // }
        Node head = new Node(1);
        head = null;
        Node newNode=null;
        Node prevNode=null;
        for (int i = 0; i < n; i++) {
            int t;
            t = sc.nextInt();
            newNode = new Node(t);
            if (i == 0) {
                 
                head = newNode;
                prevNode = newNode;

            } else {
                
                prevNode.next=newNode;
                prevNode=newNode;
            }

        }
        newNode=null;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("");

        
        temp=head;
        Node prev=head;
        while(temp!=null){
            if(temp.data>=25){
                if(prev==null){
                    head=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
                
            }

            else{
                prev=temp;
            }
            temp=temp.next;
        }
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("");

    }

}
