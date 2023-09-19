import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(9);
        dq.addLast(3);
        dq.addLast(8);

        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}