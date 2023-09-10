import java.util.ArrayList;
public class MyFile
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);

        int s = 0;
        int e = arr.size()-1;

        while(s<e)
        {
            int temp = arr.get(s);
            arr.set(s,arr.get(e));
            arr.set(e,temp);

            s++;
            e--;
        }

        System.out.println(arr);
    }
}