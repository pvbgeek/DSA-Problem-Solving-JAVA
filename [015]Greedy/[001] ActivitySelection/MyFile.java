import java.util.*;
public class MyFile
{
    public static void main(String[] args) 
    {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        int[][] mat = new int[start.length][3];

        for(int i=0; i<start.length; i++)
        {
            mat[i][0] = i;
            mat[i][1] = start[i];
            mat[i][2] = end[i]; 
        }

        Arrays.sort(mat , Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(mat[0][0]);
        int lastEnd = mat[0][2];

        for(int i=1; i<end.length; i++)
        {
            if(mat[i][1] >= lastEnd)
            {
                maxAct++;
                ans.add(mat[i][0]);
                lastEnd = mat[i][2];
            }
        }

        System.out.println("Maximum Activities are : " + maxAct);
        for(int i=0; i<ans.size(); i++)
        {
            System.out.print("A" + ans.get(i) + " , ");
        }
        System.out.println();
    }
}