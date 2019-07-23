import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int b;
      while (n>99)
      {
        n=n/10;

      }
      b=n%10;
      System.out.println(b);
	}
}