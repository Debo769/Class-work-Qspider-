import java.util.*;
class Swip
{
    public static void main(String[] args)
    {
    int a,b;
        System.out.println ("enter the value of a and b");
        Scanner Sc= new Scanner (System.in);
        a= Sc.nextInt();
        b= Sc.nextInt();
        System.out.println ("before swap:a="+a+  "\t b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println ("after swaping: a="+a+  "\t b="+b);
        
    }
}


    
        