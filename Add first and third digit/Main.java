import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int f,l,s;
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      f = num/100;
      l = num%10;
      s = f+l;
      System.out.println(s);
	}
}