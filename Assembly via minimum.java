import java.util.*;
import java.io.*;
 
public class Main {
    
    private static void runTestCase(Scanner read) {
        int n = read.nextInt();
        int N = (n * (n - 1)) >> 1;
        int[] arr = new int[N];
        
        for (int index = 0; index < N; index++) {
            arr[index] = read.nextInt();
        }
        
        int gap = n - 1;
        Arrays.sort(arr);
        int position = 0;
        
        while (position < N) {
            System.out.print(arr[position] + " ");
            position += gap;
            gap--;
        }
        System.out.println(1000000000);
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalTestCases = read.nextInt();
        for (int testCase = 0; testCase < totalTestCases; testCase++) {
            runTestCase(read);
        }
    }