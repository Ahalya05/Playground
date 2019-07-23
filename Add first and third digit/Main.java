import java.util.Scanner;
class Main
{
	public static void main (String[] args) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a,b,c;
      a=n%10;
      b=n/100;
      c=a+b;
      System.out.println(c);
	}
}