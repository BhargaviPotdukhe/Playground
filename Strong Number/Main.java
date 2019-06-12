import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,fact=1,sum=0,temp=0,digit=0;
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      temp=n;
      while(n!=0)
      {
        digit=n%10;
        fact=1;
      for(i=1;i<=digit;i++)
      {
        fact=fact*i;
      }
        sum=sum+fact;
        n=n/10;
      }
      if(sum==temp)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}