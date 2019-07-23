import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<=(arr_size-1);idx++)
      {
        arr[idx]=s.nextInt();
      }
      int largest_no;
      for(int idx=0;idx<=(arr_size-1);idx++)
      {
        if(arr[0]>arr[1])
        {
          largest_no=arr[0];
        }
        else
        {
          largest_no=arr[1];
        }
        for(idx=2;idx<=(arr_size-1);idx++)
        {
          if(largest_no<arr[idx])
          {
            largest_no=arr[idx];
          }
        }
        System.out.println(largest_no);
      }
    }
}