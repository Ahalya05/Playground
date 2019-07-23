
import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner s= new Scanner(System.in);
  	    int n=s.nextInt();
        int m=0;
        int i,j;
       for(i=1;i<=n;i++)
       {
         for(j=1;j<=i;j++)
         {
           if(m==0)
           {
             System.out.print("*");
             m=1;
           }
           else
           {
             System.out.print("#");
             m=0;
           }
         }
         System.out.print("\n");
       }
    }
}