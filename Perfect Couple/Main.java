import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       int i;
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
      }
      int value = in.nextInt();
      for(i=0;i<arr_size;i++)
      {
        for(int j=i+1;j<arr_size;j++)
        {
          int sum = arr[i]+arr[j];
          if(sum==value)
          {
            System.out.println(arr[i]+", "+arr[j]);
          }
        }
      }
    }
    
}