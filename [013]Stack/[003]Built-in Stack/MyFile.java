import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        Stack<Integer> mystk = new Stack<>();

        mystk.push(1);
        mystk.push(2);
        mystk.push(3);
        mystk.push(4);
        mystk.push(5);

        while(mystk.isEmpty() != true)
        {
            System.out.println(mystk.peek());
            mystk.pop();
        }

    }
}