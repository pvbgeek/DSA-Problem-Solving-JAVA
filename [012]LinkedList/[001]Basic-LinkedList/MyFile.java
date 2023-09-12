public class MyFile
{
    static class Node
    {
        int data;
        Node next = null;
    }
    public static void main(String[] args) 
    {
        Node head = new Node();
        head.data = 1;

        Node second = new Node();
        second.data = 2;

        head.next = second;

        Node third = new Node();
        third.data = 3;

        second.next = third;

        Node fourth = new Node();
        fourth.data = 4;

        third.next = fourth;

        Node fifth = new Node();
        fifth.data = 5;

        fourth.next = fifth;

        // to traverse

        Node curr = head;

        while(curr != null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}