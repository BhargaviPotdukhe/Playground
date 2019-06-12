import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      if(arr[0]==arr[arr_size-1])
      {
        if(arr[1]==arr[arr_size-2])
        {
        System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
      }
      else
        System.out.println("No");
    }
}