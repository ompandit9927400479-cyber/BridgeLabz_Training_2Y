package Searching;

public class Searching {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;

    public static void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    public static void Display(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data +"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        Display();
    }
}