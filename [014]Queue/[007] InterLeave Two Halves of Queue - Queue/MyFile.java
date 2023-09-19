import java.util.*;
public class MyFile
{

    static Queue<Integer> interLeave(Queue<Integer> q)
    {
        Queue<Integer> f = new LinkedList<>();

        int len = q.size();

        for(int i=1 ; i<=(len/2); i++)
        {
            f.add(q.peek());
            q.remove();
        }

        while(!f.isEmpty())
        {
            q.add(f.peek());
            q.add(q.peek());
            q.remove();

            f.remove();
        }

        return q;
    }
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=16; i++)
        {q.add(i);}

        System.out.println(q);

        q = interLeave(q);

        System.out.println(q);

    }
}