public class MyFile
{
    static void subsets(String str , String ans , int i)
    {
        if(i == str.length())
        {
            if(ans.equals(""))
            {System.out.println("Empty");}
            else {System.out.println(ans);}
            return;
        } 

        //Yes
        subsets(str , ans + str.charAt(i) , i+1);

        //No
        subsets(str , ans , i+1);
        
    }
    public static void main(String[] args) 
    { 
        String str = "abc";
        subsets(str , "" , 0);    
    }
}