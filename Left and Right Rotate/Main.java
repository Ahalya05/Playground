import java.util.Scanner;
class Main 
{
    public static void left_rotation(int arr_size, int arr[], int no_of_rotation)
    {
       int first= 1;
       int last;
       if(arr_size % 2 == 0)
       {
           last = arr_size - 1;
       }
       else
       {
           last = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[first];
           for(int idx = 3; idx < arr_size; idx = idx + 2)
           {
               arr[idx - 2] = arr[idx];
           }
           arr[last] = temp;
       }
    }
    public static void right_rotation(int arr_size, int arr[], int no_of_rotation)
    {
       int first = 0;
       int last;
       if(arr_size % 2 == 1)
       {
          last = arr_size - 1;
       }
       else
       {
          last = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[last];
           for(int idx = (last - 2); idx >= 0; idx = idx - 2)
            {
               arr[idx + 2] = arr[idx];
           }
           arr[first] = temp;
       }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int idx = 0; idx <= (arr_size - 1); idx++)
        {
            arr[idx] = in.nextInt();
        }
        int no_of_rotation = in.nextInt();
        left_rotation(arr_size, arr, no_of_rotation);
        right_rotation(arr_size, arr, no_of_rotation);
    
    for(int idx = 0; idx <= (arr_size - 1); idx++)
        {
            System.out.print(arr[idx]+" ");
        }
    }
}