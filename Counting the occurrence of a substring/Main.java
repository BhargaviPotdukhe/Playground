import java.util.Scanner;
class Main{
 
    // Type your code here
     static int countFreq(String pat, String str) {         
        int M = pat.length();         
        int N = str.length();         
        int res = 0; 
  
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            /* For current index i, check for  
        pattern match */
            int j;             
            for (j = 0; j < M; j++) { 
                if (str.charAt(i + j) != pat.charAt(j)) { 
                    break; 
                } 
            } 
  
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }         
        return res;         
    } 
   public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String pat = scan.nextLine();
    StringBuilder sb1 = new StringBuilder(pat);

               
        System.out.println(countFreq(pat, str));
  } 
}