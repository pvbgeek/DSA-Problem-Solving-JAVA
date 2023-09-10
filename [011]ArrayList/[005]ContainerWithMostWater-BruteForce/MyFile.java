import java.util.ArrayList;
public class MyFile
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        
        int maxwater = 0;

        for(int i=0; i<arr.size(); i++)
        {
            for(int j=i+1; j<arr.size(); j++)
            {
                int ht = Math.min(arr.get(i),arr.get(j));
                int wt = j-i;

                int currwater = ht*wt;

                maxwater = Math.max(maxwater,currwater);
            }
        }

        System.out.println("Maximum Water is : " + maxwater);
    }
}