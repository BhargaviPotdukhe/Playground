import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      list[i] = sc.nextInt();
    }
  
    int i=0;
    int sum1=0,sum2=0;
   
    sum1=list[i]+list[i+1]+list[i+2];
    sum2=list[i+3]+list[i+4]+list[i+5];
    if(sum1==sum2)
    {
    System.out.println("Perfect Batch");
    }
    else
      System.out.println("Not a Perfect Batch");
  }
}