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

    static Node insertll(Node head , int num , int pos)
    {
        if(pos == 1)
        {
            Node newHead = new Node();
            newHead.data = num;

            newHead.next = head;

            return newHead;
        }
        else
        {
            int count = 1;
            Node curr = head;
            while(count != pos-1)
            {
                count++;
                curr = curr.next;
            }

            Node temp = curr.next;
            Node newNode = new Node();
            newNode.data = num;

            curr.next = newNode;
            newNode.next = temp;

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

        int num = 55; // user can modify
        int pos = 7;

        if(pos<1 || pos>len+1)
        {System.out.println("Invalid Position !!");}
        else
        {head = insertll(head , num , pos);}

        printll(head);

        sc.close();
    }
}