public class MyFile
{
    static boolean matsearch(int[][] mat , int key)
    {
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                if(mat[i][j] == key)
                {System.out.println("Element found at: (" + i + "," + j + ")");return true;}
            }
        }
        System.out.println("Element not found !!");
        return false;
    }
    public static void main(String[] args) 
    {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=29;
        matsearch(mat,key);    
    }
}