import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i;
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
	}
}