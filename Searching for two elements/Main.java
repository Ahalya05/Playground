import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
       int arr_size=s.nextInt();
      int arr[]= new int[arr_size];
      for(int index=0;index<=(arr_size-1);index++)
      {
        arr[index]=s.nextInt();
      }
      int search_elem_1=s.nextInt();
      int search_elem_2=s.nextInt();
      int element_1_index= -1;
      int element_2_index= -1;
      for(int index=0;index<=(arr_size-1);index++)
      {
        if(search_elem_1==arr[index])
        {
          element_1_index=index;
        }
        if(search_elem_2==arr[index])
        {
          element_2_index=index;
        }
      }
        System.out.println(element_1_index);
        System.out.println(element_2_index);
      
    }
}