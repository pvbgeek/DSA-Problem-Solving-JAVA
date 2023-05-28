public class MyFile
{
    static void printnum(int num , String str)
    {
        if(num==0)
        {
            System.out.println(str);
            return;
        }
        int d = (num%10);
        if(d==0){str+="zero ";}
        else if(d==1){str+="one ";}
        else if(d==2){str+="two ";}
        else if(d==3){str+="three ";}
        else if(d==4){str+="four ";}
        else if(d==5){str+="five ";}
        else if(d==6){str+="six ";}
        else if(d==7){str+="seven ";}
        else if(d==8){str+="eight ";}
        else{str+="nine ";}
        printnum(num/10, str);
    }
    public static void main(String[] args) 
    {
        int num = 223654;
        System.out.println("Digits in Words :");
        printnum(num , "");
        System.out.println();    
    }
}