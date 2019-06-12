import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int digit=0,sum=0,temp;
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      temp=n;
      while(n!=0)
      {
        digit=n%10;
        sum=sum+(digit*digit*digit);
        n=n/10;
      }
      if(sum==temp)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
	}
}