
import java.util.*;
import java.io.*;
public class unstring
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence="",wrd="";
        int flag=0;

        System.out.println("Enter the sentence:");
        sentence = scanner.nextLine();
        int n=sentence.length();
        char c;
        for(int i=0;i<n;i++)
        {
            //c=sentence.charAt(i);
            for(int j=i+1;j<n;j++)
            {
                 if (sentence.charAt(i)==sentence.charAt(j))
                 {
                     flag=1;
                     break;
                 }
                // else
                 //System.out.println(c);
                 
                 
            }
            
        }
        if(flag==1)
        System.out.println("not a unique string");
        else
                 System.out.println("unique string");
}
}
