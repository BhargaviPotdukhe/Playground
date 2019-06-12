import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      int i,j,t=1;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=i;j<n;j++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print(t+" ");
          t++;
        }
        System.out.print("\n");
      }
    }    
}