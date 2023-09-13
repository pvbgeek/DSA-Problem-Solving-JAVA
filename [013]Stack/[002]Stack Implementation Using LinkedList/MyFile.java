public class MyFile
{
    static class Node
    {
        int data;
        Node next = null;
    }

    static class Stack
    {
        static Node head = null;

        public static boolean isEmpty()
        {
            if(head == null)
            {return true;}
            else
            {return false;}
        }

        public static void push(int num)
        {
            Node newNode = new Node();
            newNode.data = num;
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            else
            {
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop()
        {
            int ele = head.data;
            head = head.next;

            return ele;
        }

        public static int peek()
        {
            if(isEmpty())
            {return -1;}
            else
            {return head.data;}
        }

    }
    public static void main(String[] args) 
    {
        Stack s = new Stack();
       
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Current Top is : " + s.peek());

        while(s.isEmpty() != true)
        {
            System.out.println(s.pop());
        }

    }
}