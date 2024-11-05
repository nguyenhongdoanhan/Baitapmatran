import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui long nhap so lon hon 0.");
        } else {
            System.out.print("Day Fibonacci: ");
            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            }
        }

        
        scanner.close();
    }
}

