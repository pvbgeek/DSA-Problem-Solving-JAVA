import java.util.*;
public class MyFile
{
    static class Node
    {
        int data;
        Node next = null;
    }

    static void printll(Node first)
    {
        Node curr = first;

        while(curr != null)
        {
            System.out.print(curr.data + "->");

            curr = curr.next;
        }
        System.out.println("null");
    }

    

    static void removeCycle(Node first)
    {
        Node slow = first;
        Node fast = first.next;
        boolean isCycle = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                isCycle = true;
                break;
            }
        }
        
        if(isCycle == false)
        {return;}

        slow = first;
        Node meet = fast;
        Node prev = null;
        while(slow != meet)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev = fast;
        prev.next = null;
    }

    public static void main(String[] args) 
    {
        //this is to demonstrate the dynamic creation of linkedlist for a given length
        Scanner sc = new Scanner(System.in);
        

        Node first = new Node();
        System.out.println("Enter a number : ");
        first.data = sc.nextInt();

        Node second = new Node();
        System.out.println("Enter a number : ");
        second.data = sc.nextInt();
        first.next = second;

        Node third = new Node();
        System.out.println("Enter a number : ");
        third.data = sc.nextInt();
        second.next = third;

        Node fourth = new Node();
        System.out.println("Enter a number : ");
        fourth.data = sc.nextInt();
        third.next = fourth;

        Node fifth = new Node();
        System.out.println("Enter a number : ");
        fifth.data = sc.nextInt();
        fourth.next = fifth;

        Node sixth = new Node();
        System.out.println("Enter a number : ");
        sixth.data = sc.nextInt();
        fifth.next = sixth;

        Node seventh = new Node();
        System.out.println("Enter a number : ");
        seventh.data = sc.nextInt();
        sixth.next = seventh;

        seventh.next = fourth;

        removeCycle(first);

        printll(first);
        sc.close();
    }
}