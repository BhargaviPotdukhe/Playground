import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int row,col;
      for(row=1;row <= n;row++)
      {
         if(row==1 || row==n)
          {
        for(col=1;col<=n;col++)
        {
          System.out.print("*");
         }
        }
        else
        {
           for(col=1;col <= n;col++)
           {
             if(col==1 || col==n)
             {
               System.out.print("*");
             }
             else
               System.out.print(" ");
           }
        }
        System.out.print("\n");
      }
	}
}