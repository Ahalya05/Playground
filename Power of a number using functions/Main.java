import java.util.Scanner;
class Main
{
  public static void main (String args[])
  {
    Scanner s=new Scanner(System.in);
    int base=s.nextInt();
    int exponent=s.nextInt();
    int a=bn(base,exponent);
    System.out.print(a);
  }
  public static int bn(int b,int e)
  {
    int n=1;
    while(e>0)
    {
      n=n*b;
      e--;
    }
    return n;
  }
}