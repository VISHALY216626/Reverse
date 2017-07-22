import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] s1= {"apple","app","application"};
         String s2="";
         
         
        	 for(int j=0;j<s1.length;j++)
        	 {
        		 if(s1[0].substring(j,j+1)==s1[j+1].substring(j,j+1))
        		 {
        			s2+=s1[0].substring(j,j+1);
        			  System.out.println(s2);
        		 }
        	 }
        	 
         
       
	}

}
