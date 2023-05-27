public class MyFile
{
    static String uppercase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++)
        {
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }
    public static void main(String[] args) 
    {
        String str = "tony stark - iron man";
        System.out.println("Original String : " + str);
        System.out.println("Modified String : " + uppercase(str));    
    }
}