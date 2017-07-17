import java.util.Scanner;
import java.lang.String;
public class posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>0)
		{
			System.out.println("The number is positive");
		}
		else if(n<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
