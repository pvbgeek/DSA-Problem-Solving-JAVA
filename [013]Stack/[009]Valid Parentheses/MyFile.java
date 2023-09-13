import java.util.*;
public class MyFile
{
    static boolean validpar(String str)
    {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
            {stk.push(str.charAt(i));}

            if(str.charAt(i) == ']' && stk.peek() != '[')
            {return false;}

            if(str.charAt(i) == '}' && stk.peek() != '{')
            {return false;}

            if(str.charAt(i) == ')' && stk.peek() != '(')
            {return false;}

            if(str.charAt(i) == ']' && stk.peek() == '[')
            {stk.pop();}

            if(str.charAt(i) == '}' && stk.peek() == '{')
            {stk.pop();}

            if(str.charAt(i) == ')' && stk.peek() == '(')
            {stk.pop();}
            
        }

        if(stk.isEmpty())
        {return true;}
        else
        {return false;}
    }
    public static void main(String[] args) 
    {
            String str = "[[{({)}}]]";
            System.out.println(validpar(str));
    }
}
