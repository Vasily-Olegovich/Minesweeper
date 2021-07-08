import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int arrayLength = scanner.nextInt();
       
       int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

      //  System.out.println(Arrays.toString(array));

       int n = scanner.nextInt();

       int result = 0;

       for (int a : array) {
            if (a == n) {
                result++;
            }
       }

        System.out.println(result);
       // put your code here
    }
}