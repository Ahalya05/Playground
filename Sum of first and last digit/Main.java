import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b,c;
      b=n%10;
        while(n>=10)
        {
            n/=10;
        }
            c=n+b;
      System.out.println(c);
        
      
	}
}