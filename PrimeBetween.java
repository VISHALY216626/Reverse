import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
         int a,b,c,count=0,i,j;
         Scanner s=new Scanner(System.in);
         a=s.nextInt();
         b=s.nextInt();
         for(i=a;i<=b;i++)
         {
             for( j=2;j<i;j++)
             {
                 if(i%j==0)
                 {
                     count=0;
                     break;
                 }
                 else
                 {
                     count=1;
                 }
             }
             if(count==1)
             {
                 System.out.println(i);
             }
         }
    }
}
