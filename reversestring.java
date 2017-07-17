import java.util.Scanner;
import java.lang.String;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		  
		 String s1=new StringBuffer(s).reverse().toString();
		 System.out.println(s1);
    
	}

}
