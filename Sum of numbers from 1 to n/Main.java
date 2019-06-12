import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int i,sum=0;
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      for(i=0;i<=n;i++)
      {
       sum=sum+i;
      }
      System.out.println(sum);
	}
}