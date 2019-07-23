import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int base=s.nextInt();
        int expo=s.nextInt();
        int temp=1;
        while(expo!=0)
        {
            temp=temp*base;
            expo--;
        }
      System.out.print(temp);
    }
}