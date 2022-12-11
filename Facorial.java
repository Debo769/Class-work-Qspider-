import java.util.*;
class Facorial
{
    public static void main (String []args)
    {
    int a=0;
	int n=0;
	int fact=1;
    Scanner Sc= new Scanner (System.in);
    System.out.println ("Enter the upto no:");
	n=Sc.nextInt();
    for (a=1;a<=n;a++){
    fact=a*fact;
    }
	System.out.println ("rasult =" +fact);
}
}