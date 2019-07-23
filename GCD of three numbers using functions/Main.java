import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      int res=gcd_of_two_num(a,b);
      System.out.print(gcd_of_two_num(a,b));
	}
  public static int gcd_of_two_num(int n1,int n2)
  {
    int min;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while (min>=1)
    {
      if((n1%min==0)&&(n2%min==0))
         {
           return min;
         }
         --min;
    }
    return 0;
  }
}