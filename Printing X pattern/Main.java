import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int row,col;
      for(row=1;row <= n;row++)
      {
        for(col=1;col<=n;col++)
        {
         if(row==col || col== (n-row+1))
         {
            System.out.print("*");
         }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }
	}
}