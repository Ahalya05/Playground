import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder(str);
        int str_len=str.length();
        int front=0;
        int end=str_len-1;
        boolean palin=true;
       while(front<end)
       {
         if(str.charAt(front)!=str.charAt(end))
         {
           palin=false;
           break;
         }
         front++;
         end--;
       }
      if(palin==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}