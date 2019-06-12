import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a,b;
       Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      a = num%100;
      b = a/10;
      System.out.println(b);
      
	}
}