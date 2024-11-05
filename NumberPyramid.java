import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhap so dong cua kim tu thap so: ");
        int n = scanner.nextInt();

        System.out.println("Kim tu thap so:");

        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
           
            System.out.println();
        }

      
        scanner.close();
    }
}
