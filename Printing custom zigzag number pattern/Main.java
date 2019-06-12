import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int row,col;
      for(row=1;row <= n;row++)
      {
          if(row%2 != 0)
          {
            for(col=1;col<n;col++)
            {
            System.out.print(row);
            }
            System.out.print(row+1);
          }
        else
        {
            System.out.print(row+1);
           for(col=1;col<n;col++)
            {
            System.out.print(row);
            }
        }
        System.out.print("\n");
      }
}
}