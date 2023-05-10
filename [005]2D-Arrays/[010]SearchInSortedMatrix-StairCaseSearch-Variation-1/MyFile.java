public class MyFile
{
    static boolean matsearch(int[][] mat , int key)
    {
        int r=0;
        int c=mat[0].length-1;

        while(r<mat.length && c>=0)
        {
            if(mat[r][c]==key)
            {System.out.println("Element found at: (" + r + "," + c + ")");return true;}
            else if(key < mat[r][c])
            {c--;}
            else
            {r++;}
        }

        System.out.println("Element Not Found !!");
        return false;
    }
    public static void main(String[] args) 
    {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=29;
        matsearch(mat,key);    
    }
}