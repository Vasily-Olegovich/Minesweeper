import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int a : arr) {
            if (a > n) {
                sum += a;
            }

        }

        System.out.println(sum);

    }
}
