import java.util.*;
import java.io.*;
 
public class Main {
    
    private static void runTestCase(Scanner read) {
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = read.nextInt();
        }
        
        long prefix = 0;
        long result = Integer.MIN_VALUE;
        
        for (int index = 0; index < n; index++) {
            
            if (index > 0 && Math.abs(arr[index - 1] % 2) == Math.abs(arr[index] % 2)) {
                prefix = 0;
            }
            prefix += arr[index];
            result = Math.max(result, prefix);
            if (prefix < 0) {
                prefix = 0;
            }
        }
        
        System.out.println(result);
      
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalTestCases = read.nextInt();
        for (int testCase = 0; testCase < totalTestCases; testCase++) {
            runTestCase(read);
        }
    }
}