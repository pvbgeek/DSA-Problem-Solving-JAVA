public class MyFile
{
    public static void main(String[] args) 
    {
        String str1 = "Parth";
        String str2 = "Arjun";
        String str3 = "Parth";
        String str4 = new String("Arjun");
        
        if(str1 == str3)
        {System.out.println("Strings a Same");}
        else
        {System.out.println("Strings are Different");}

        if(str2 == str4)
        {System.out.println("Strings are Same");}
        else
        {System.out.println("Strings are Differnet");}

        if(str2.equals(str4))
        {System.out.println("Strings are Same");}
        else
        {System.out.println("Strings are Different");}
    }
}