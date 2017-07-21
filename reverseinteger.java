import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int x;
  
while(n!=0)
   {
       x=n%10;
	   n=n/10;
	   System.out.print(x);
   }
	}

}
