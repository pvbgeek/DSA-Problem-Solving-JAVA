import java.util.*;
public class MyFile
{
    static class Node
    {
        int data;
        Node next = null;
    }

    static void createll(Node head , int len)
    {
        Scanner sc = new Scanner(System.in);
        
        Node curr = head;

        for(int i=1; i<len; i++)
        {
            Node newNode = new Node();
            System.out.println("Enter a number : ");
            newNode.data = sc.nextInt();

            curr.next = newNode;
            curr = newNode;
        }
        sc.close();
    }

    static void printll(Node head)
    {
        System.out.println("Linked List is : ");
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + "->");

            curr = curr.next;
        }
        System.out.println("null");
    }

    static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reversell(Node mid)
    {
        Node curr = mid;
        Node prev = null;
        Node Next;

        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }

    static int countNodes(Node head)
    {
        Node curr = head;
        int cnt = 1;
        while(curr != null)
        {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    static Node zigzagll(Node head)
    {
        int len = countNodes(head);
        Node mid = findMid(head);
        mid = reversell(mid);

        Node LH = head;
        Node RH = mid;

        Node nextL;
        Node nextR;

        while(LH != null && RH != null)
        {
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            RH = nextR;
            LH = nextL;
        }
        if(len%2 != 0)
        {LH.next = null;}
        else
        {RH.next = null;}
        return head;
    }
    public static void main(String[] args) 
    {
        //this is to demonstrate the dynamic creation of linkedlist for a given length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Linked List : ");
        int len = sc.nextInt();

        Node head = new Node();
        System.out.println("Enter a number : ");
        head.data = sc.nextInt();

        createll(head , len);
        printll(head);

        head = zigzagll(head);
        printll(head);
        sc.close();
    }
}