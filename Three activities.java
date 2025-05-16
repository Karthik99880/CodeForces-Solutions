import java.util.*;
import java.io.*;
 
public class Main {
    
    private static int[] findMaxEleIndices(int[] arr) {
        int[] result = new int[3];
        Arrays.fill(result, -1);
        for (int index = 0; index < arr.length; index++) {
            if (result[0] == -1 || arr[index] > arr[result[0]]) {
                result[2] = result[1];
                result[1] = result[0];
                result[0] = index;
            } else if (result[1] == -1 || arr[index] > arr[result[1]]) {
                result[2] = result[1];
                result[1] = index;
            } else if (result[2] == -1 || arr[index] > arr[result[2]]) {
                result[2] = index;
            }
        }
        
        return result;
    }
    
    private static void runTestCase(Scanner read) {
        int n = read.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        
        for (int index = 0; index < n; index++) {
            arr1[index] = read.nextInt();
        }
        
        for (int index = 0; index < n; index++) {
            arr2[index] = read.nextInt();
        }
        
        for (int index = 0; index < n; index++) {
            arr3[index] = read.nextInt();
        }
        
       int[] arrOneMaxEles = findMaxEleIndices(arr1);
       int[] arrTwoMaxEles = findMaxEleIndices(arr2);
       int[] arrThreeMaxEles = findMaxEleIndices(arr3);
       long result = 0;
 
       
       
       
       for (int index1 = 0; index1 < 3; index1++) {
           for (int index2 = 0; index2 < 3; index2++) {
               for (int index3 = 0; index3 < 3; index3++) {
                   long currentAnswer = 1L * arr1[arrOneMaxEles[index1]];
                   if (arrOneMaxEles[index1] != arrTwoMaxEles[index2]) {
                       currentAnswer += 1L * arr2[arrTwoMaxEles[index2]];
                       if (arrOneMaxEles[index1] != arrTwoMaxEles[index2] && arrTwoMaxEles[index2] != arrThreeMaxEles[index3] && arrOneMaxEles[index1] != arrThreeMaxEles[index3]) {
                           currentAnswer += 1L * arr3[arrThreeMaxEles[index3]];
                           result = Math.max(result, currentAnswer);
                           
                       }
                   }
                   
                   
                   
               }
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