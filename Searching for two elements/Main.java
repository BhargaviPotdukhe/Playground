import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int count=0,p1=-1,p2=-1;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         if(arr[idx]==n1)
         {
           count++;
           p1=idx;
         }
      }
      if(count==1)
        System.out.println(p1);
      else
        System.out.println("-1");
      count=0;
       for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         if(arr[idx]==n2)
         {
           count++;
           p2=idx;
         }
      }
      if(count==1)
        System.out.println(p2);
      else
        System.out.println("-1");
       
    }
}