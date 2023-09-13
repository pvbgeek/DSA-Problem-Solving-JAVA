import java.util.*;
public class MyFile
{
    static void pushAtBottom(Stack stk , int num)
    {
        if(stk.isEmpty())
        {
            stk.push(num);
            return;
        }
        int ele = (int)stk.pop();
        pushAtBottom(stk, num);
        stk.push(ele);
    }
    static void reversestk(Stack stk)
    {
        if(stk.isEmpty())
        {return;}
        int ele = (int)stk.pop();
        reversestk(stk);
        pushAtBottom(stk, ele);
        
    }
    public static void main(String[] args) 
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        
        System.out.println("Stack after reversing : ");

        reversestk(stk);

        while(stk.isEmpty() != true)
        {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}