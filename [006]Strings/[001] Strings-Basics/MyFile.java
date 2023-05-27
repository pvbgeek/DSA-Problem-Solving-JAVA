import java.util.Scanner;
public class MyFile
{
    public static void main(String[] args) 
    {
        char[] str1 = new char[10];
        char ch = 'a';
        
        for(int i=0; i<str1.length; i++)
        {
            str1[i] = ch;
            ch++;
        }

        for(char x : str1)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        String str2 = new String("Parth");
        String str3 = "PVB-GEEK";

        System.out.println(str2);
        System.out.println(str3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str4 = sc.nextLine();
        System.out.println("Entered String is : " + str4);

        sc.close();
    }
}