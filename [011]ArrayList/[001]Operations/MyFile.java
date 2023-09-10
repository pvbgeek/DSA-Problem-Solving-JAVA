import java.util.ArrayList;
import java.util.Collections;
public class MyFile
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3,7);
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        //contains
        System.out.println(list.contains(4));
        System.out.println(list.contains(7));

        //set
        list.set(2,9);
        System.out.println(list);

        //remove
        list.remove(2);
        list.remove(Integer.valueOf(5));
        System.out.println(list);

        //size
        System.out.println(list.size());

        //traverse
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println();
    }
}