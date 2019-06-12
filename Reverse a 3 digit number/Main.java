import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int f,s,t,r;
     Scanner in = new Scanner(System.in);
      int num = in.nextInt();
    f = num/100;
    s = (num/10)%10;
    t = num%10;
    r = (t*100)+(s*10)+f;
    System.out.println(r);
  }
}