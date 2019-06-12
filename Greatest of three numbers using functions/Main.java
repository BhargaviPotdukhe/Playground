import java.util.Scanner;
class Main{
  public static int large(int a,int b,int c)
  {
    if(a>b && a>c)
      return a;
    else if (b>a && b>c)
      return b;
    else
      return c;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int l = large(a,b,c);
      System.out.print(l);
	}
}