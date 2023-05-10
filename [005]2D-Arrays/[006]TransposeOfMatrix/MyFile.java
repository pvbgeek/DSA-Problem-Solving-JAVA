import java.util.*;
public class MyFile
{
    static void printmatrix(int[][] mat)
    {
        System.out.println("Matrix is Printed Below:");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {System.out.print(mat[i][j] + " ");}
            System.out.println();
        }
    }

    static void inputmatrix(int[][] mat)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements:");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static int[][] transposemat(int[][] mat)
    {
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                ans[j][i] = mat[i][j];
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int cols=sc.nextInt();
        int[][] mat = new int[rows][cols];
        inputmatrix(mat);
        System.out.println("Before Transpose:");
        printmatrix(mat);
        mat = transposemat(mat);
        System.out.println("After Transpose:");
        printmatrix(mat);
        sc.close();
    }
}