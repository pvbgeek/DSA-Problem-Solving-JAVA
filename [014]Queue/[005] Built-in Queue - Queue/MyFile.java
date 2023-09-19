import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        Queue<Integer> myQ = new LinkedList<>();
        
        myQ.add(1);
        myQ.add(2);
        myQ.add(3);
        myQ.add(4);
        myQ.add(5);

        System.out.println(myQ);

        
        while(!myQ.isEmpty())
        {
            System.out.print(myQ.peek() + " ");
            myQ.remove();
        }
        System.out.println();

    }
}