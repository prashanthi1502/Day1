import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Enter the number of even numbers to generate: ");
        for (int i = 1; i <= n; i++) {
        System.out.println("First " + n + " even numbers:"); // first 5 even numbers
            System.out.print(2 * i + " ");
        }
    }
}
