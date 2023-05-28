public class MyFile
{
    public static void main(String[] args) 
    {
        String[] fruits = {"banana","apple","mango","kiwi","pineapple","strawberry"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++)
        {
            if(largest.compareTo(fruits[i]) < 0)
            {
                largest = fruits[i];
            }
        }
        System.out.println("Largest String is : " + largest);
    }
}