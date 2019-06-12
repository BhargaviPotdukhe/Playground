import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int i,fact=1;
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
	}
}