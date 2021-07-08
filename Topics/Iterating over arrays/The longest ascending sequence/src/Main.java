import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] answer = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                answer[j]++;
                //System.out.println(arr[j]);
            } else {
                j++;
            }

        }
        Arrays.sort(answer);
        //System.out.println(Arrays.toString(answer));
        System.out.println(answer[answer.length-1] + 1);

    }
}