import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a,b,c,reverse;
    a=n/100;
    b=((n/10)%10);
    c=n%10;
    reverse=(c*100)+(b*10)+a;
    System.out.println(reverse);
  }
}