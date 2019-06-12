import java.util.Scanner;
class Main{
   public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
     String input = in.nextLine();

    String out = checkPangram(input);
     int n = out.length(); 
    for(int i=0;i<n;i++)
    {
   System.out.print(out.charAt(i)+" ");
    }
}

private static String checkPangram(String input)
{
    input = input.toLowerCase();
    String alph = "abcdefghijklmnopqrstuvwxyz";
    int max = 26;

    for (int i = 0; i < max; i++)
    {
        int index = input.indexOf(alph.charAt(i));
        if (index != -1)
        {
            alph = alph.substring(0, i) + alph.substring(i + 1);
            i--;
            max--;
        }
    }
  return alph;
     }
 }
