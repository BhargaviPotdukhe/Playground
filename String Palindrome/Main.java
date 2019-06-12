import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
     
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    String rev = "";
      for ( int i = str_len - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         {
           System.out.print("Yes");
         }
         else
         System.out.print("No");
    } 
}