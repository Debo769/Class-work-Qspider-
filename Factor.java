import java.util.*;
class Factor
{
    public static void main(String[] args) 
		{
        System.out.print("Enter any no");
        int n;
        Scanner Sc = new Scanner (System.in);
        n=Sc.nextInt();
        for (int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print (i+" ");
            }
        }
    }
}