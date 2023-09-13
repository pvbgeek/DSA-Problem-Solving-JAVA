import java.util.*;
public class MyFile
{
    static void nextGreater(int[] arr , int[] ans)
    {
         Stack<Integer> stk = new Stack<>();

         for(int i=arr.length-1; i>=0; i--)
         {
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i])
            {stk.pop();}

            if(stk.isEmpty())
            {ans[i] = -1;}
            else
            {ans[i] = arr[stk.peek()];}

            stk.push(i);
         }
    }
    public static void main(String[] args) 
    {
        int[] arr = {6,8,0,1,3};
        int[] ans = new int[arr.length];
        nextGreater(arr , ans);

        for(int x : ans)
        {
            System.out.print(x + " ");
        }
    }
}