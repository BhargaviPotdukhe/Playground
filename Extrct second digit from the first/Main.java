import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int last_digit=0, second_digit=0;
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     while(n!=0)
      {
       second_digit = last_digit;
        last_digit = n%10;
        n=n/10;
      }
      System.out.println(second_digit);
	}
}