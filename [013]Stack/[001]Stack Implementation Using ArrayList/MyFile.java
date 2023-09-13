import java.util.ArrayList;
public class MyFile
{
    static ArrayList<Integer> stk = new ArrayList<>();
    
    static void push(int data)
    {
        stk.add(data);
    }

    static int pop()
    {
        int ele = stk.get(stk.size()-1);
        stk.remove(stk.size()-1);

        return ele;
    }

    static int peek()
    {
        return stk.get(stk.size()-1);
    }

    public static void main(String[] args) 
    {

            push(1);
            push(2);
            push(3);
            push(4);
            push(5);

            System.out.println(peek());

            while(stk.isEmpty() != true)
            {
                System.out.println(pop());
            }
    }
}