import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int i=1;
      int n = in.nextInt();
      int t=n;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=(n-(row-1));col++)
        {
          System.out.print(t);
          t=t-1;
        }
        t=n-i;
        i++;
        System.out.print("\n");
      }
	}
}