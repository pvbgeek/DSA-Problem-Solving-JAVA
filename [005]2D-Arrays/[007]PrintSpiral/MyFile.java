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

    static void printspiral(int[][] mat)
    {
        int startrow=0;
        int startcol=0;
        int endrow=mat.length-1;
        int endcol=mat[0].length-1;

        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int j=startcol; j<endcol; j++)
            {System.out.print(mat[startrow][j] + " ");}

            //right
            for(int i=startrow; i<endrow; i++)
            {System.out.print(mat[i][endcol] + " ");}

            //bottom
            for(int j=endcol; j>startcol; j--)
            {System.out.print(mat[endrow][j] + " ");}

            //left
            for(int i=endrow; i>startrow; i--)
            {System.out.print(mat[i][startcol] + " ");}


            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();
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
        System.out.println("Normal Matrix:");
        printmatrix(mat);
        System.out.println("Spiral Matrix:");
        printspiral(mat);
        sc.close();
    }
}