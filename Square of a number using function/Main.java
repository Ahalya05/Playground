import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=mul(n);
      System.out.print(num);
	} 
  public static int mul(int n)
  {
   int num=n*n;
    return num;
  }
}