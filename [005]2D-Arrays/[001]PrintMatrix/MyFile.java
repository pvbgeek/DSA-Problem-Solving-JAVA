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
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int cols=sc.nextInt();
        int[][] mat = new int[rows][cols];
        inputmatrix(mat);
        printmatrix(mat);
        sc.close();
    }
}