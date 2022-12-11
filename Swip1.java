import java.util.*;
class Swip1
{
    public static void main(String[] args)
    {
    int a,b,c;
    System.out.println ("enter the value of a and b");
        Scanner Sc= new Scanner (System.in);
        a= Sc.nextInt();
        b= Sc.nextInt();
        System.out.println ("before swap:a="+a+  "b="+b);
        a=a+b;
        c=a;
        a=b;
        b=c;
    System.out.println ("Afer swap:a="+a+  "b="+b);
        
    }
}