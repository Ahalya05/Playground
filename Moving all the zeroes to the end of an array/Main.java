import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<arr_size;idx++)
      {
        arr[idx]=s.nextInt();
      }
      move_zeros(arr_size,arr);
      for(int idx=0;idx<arr_size;idx++)
      {
        System.out.print(arr[idx]+" ");
      }
    }
  public static void move_zeros(int arr_size,int arr[])
  {
    int count=0;
    for(int idx=0;idx<arr_size;idx++)
    {
       if(arr[idx]!=0)
       {
          int temp=arr[idx];
         arr[idx]=arr[count];
         arr[count]=temp;
         count++;
       }
    }
  }
}