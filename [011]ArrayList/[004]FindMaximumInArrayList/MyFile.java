import java.util.ArrayList;
public class MyFile
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(7);
        arr.add(4);
        arr.add(3);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.size()-1; i++)
        {
            if(arr.get(i)>max)
            {max = arr.get(i);}
        }

        System.out.println("Maximum is : " + max);
    }
}