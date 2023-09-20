public class MyFile
{
    static int gridways(int i , int j , int n , int m)
    {
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        else if(i == n || j == m)
        {
            return 0;
        }

        return gridways(i+1, j, n, m) + gridways(i , j+1 , n , m);
    }
    public static void main(String[] args) 
    {
        int n = 3;
        int m = 3;
        int ans = gridways(0 , 0 , n , m);
        
        System.out.println(ans);
    }
}