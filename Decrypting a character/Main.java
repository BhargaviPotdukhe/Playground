import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
       Scanner in = new Scanner(System.in);
    char ch = in . next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a' && ch <= 'z'){
      int offset = ch ;
      
      ch = (char)(offset + 23);
    }
    else if(ch >= 'A' && ch <= 'Z'){
      int offset = ch ;
  
      ch = (char)(offset - key);
    }
    System.out.print(ch);
  }
    }
