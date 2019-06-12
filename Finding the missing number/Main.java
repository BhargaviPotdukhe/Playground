import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int missing_val = 0;
        for(int val = 1; val <= n; val++)
        {
           int counter=0;
            for(int indx = 0; indx <= n - 1; indx++){
                if(arr[indx] == val)
                {
                    counter=1;
                    break;
                }
            }
            if(counter==0){
                missing_val = val;
                break;
            }
        }
        System.out.print(missing_val);
    }
    }
