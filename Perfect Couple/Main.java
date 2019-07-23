import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner s= new Scanner(System.in);
       int arr_size = s.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= (arr_size - 1); index++)
       {
           arr[index] = s.nextInt();
       }
       int value = s.nextInt();
       perfect_couple(arr_size, arr, value);
    }
    public static void perfect_couple(int arr_size, int arr[], int value)
    {
        for(int index_1 = 0; index_1 <= (arr_size - 1); index_1++)
        {
            for(int index_2 = (index_1 + 1); index_2 <= (arr_size - 1); index_2++)
            {
                int sum = arr[index_1] + arr[index_2];
                if(sum == value)
                {
                    System.out.println(arr[index_1] + "," + " " + arr[index_2]);
                }
            }
        }
    }
}