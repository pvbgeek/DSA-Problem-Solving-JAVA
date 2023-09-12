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

    static Node removell(Node head , int pos)
    {
        if(pos == 1)
        {
            Node newHead = head.next;
            head = null;
            return newHead;
        }
        else
        {
            int cnt = 1;
            Node curr = head;

            while(cnt != pos-1)
            {
                curr = curr.next;
                cnt++;
            }

            Node temp = curr.next;
            curr.next = curr.next.next;
            temp = null;
            return head;
        }
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

        int pos = 4;

        if(pos<1 || pos>len)
        {
            System.out.println("Invalid Position Cannot Delete");
        }
        else
        {
            head = removell(head , pos);
            System.out.println("Linked List after modification is : ");
            printll(head);
        }

        sc.close();
    }
}