import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so de tao bang nhan: ");
        int number = scanner.nextInt();

        System.out.println("Bang nhan cua " + number + " la:");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
