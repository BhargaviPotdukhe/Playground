import java.util.Scanner;
class Main
{
  public static int power(int b,int e)
  {
    if(e==0)
      return 1;
    else if (e%2 == 0)
      return power(b,e/2)*power(b,e/2);
    else
      return b*power(b,e/2)*power(b,e/2);
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    int e = in.nextInt();
    int v = power(b,e);
    System.out.print(v);
  }
}