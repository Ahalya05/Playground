import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a;
      for(int i=1;i<=n;i++)
      {
        a=2*i-1;
        System.out.println(a);
      }
	}
}