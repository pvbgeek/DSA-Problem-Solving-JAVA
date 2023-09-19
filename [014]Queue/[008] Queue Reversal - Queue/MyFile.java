import java.util.*;
public class MyFile
{
    static Queue<Integer> reverse(Queue<Integer> q)
    {
        Stack<Integer> temp = new Stack<>();

        while(!q.isEmpty())
        {
            temp.push(q.peek());

            q.remove();
        }

        while(!temp.isEmpty())
        {
            q.add(temp.peek());

            temp.pop();
        }

        return q;
    }
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        q = reverse(q);

        System.out.println(q);
    }
}