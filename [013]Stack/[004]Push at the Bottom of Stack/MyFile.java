import java.util.*;
public class MyFile
{
    static void pushAtBottom(Stack stk , int num)
    {
        if(stk.isEmpty())
        {
            stk.push(num);
            System.out.println("Inserted at bottom " + stk.peek());
            return;
        }
        int ele = (int)stk.pop();
        pushAtBottom(stk, num);
        stk.push(ele);
        System.out.println("Top is : " + stk.peek());
    }
    public static void main(String[] args) 
    {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.push(1));
        System.out.println(stk.push(2));
        System.out.println(stk.push(3));
        System.out.println(stk.push(4));

        pushAtBottom(stk,5);

        System.out.println("Final Stack is : ");

        while(stk.isEmpty() != true)
        {
            System.out.println(stk.peek());
            stk.pop();
        }
        

    }
}