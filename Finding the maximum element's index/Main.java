import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int j=0,i,l=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(list[i]>l)
      {
        l=list[i];
        j=i;
      }
    }
    System.out.print(j);
    
  }
}