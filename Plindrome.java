import java.util.Scanner;
class Palindrome 
{
public static void main(String[] args) 
{
int a,n,b,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any num: ");
n=s.nextInt();
b=n;
while(n!=0)
{
a=n%10;
n=n/10;
temp=temp*10+a;
}
if(temp==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}
}
