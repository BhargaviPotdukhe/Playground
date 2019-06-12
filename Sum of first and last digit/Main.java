import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
      int first_digit=0, last_digit=0,sum=0; 
      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      first_digit=n%10;
      
      while(n!=0)
      {
        last_digit = n%10;
        n=n/10;
      }
      
      sum = first_digit + last_digit;
      System.out.println(sum);
      
	}
}