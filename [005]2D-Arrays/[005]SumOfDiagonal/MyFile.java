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

    static int diagonalsum(int[][] mat)
    {
        int sum=0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                if(i == j)
                {sum+=mat[i][j];}
                else if(i+j == mat.length-1)
                {sum+=mat[i][j];}
            }
        }
        return sum;
    }

    static int diagonalsumoptimised(int[][] mat)
    {
        int sum=0;
        for(int i=0; i<mat.length; i++)
        {
            sum+=mat[i][i];
            if(i != mat.length-i-1)
            {sum+=mat[i][mat.length-i-1];}
        }
        return sum;
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
        System.out.println("Sum of Diagonal Elements in the Matrix is:(Non-Optmised) " + diagonalsum(mat));
        System.out.println("Sum of Diagonal Elements in the Matrix is:(Optimised) " + diagonalsumoptimised(mat));
        sc.close();
    }
}