import java.util.Scanner;
import java.util.Random;

public class TroChoiDoanSo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        Random random = new Random();
         
        int soCanDoan = random.nextInt(50) + 1;
        int soDoan = 0; 

        System.out.println("Chao mung ban den voi tro choi doan so!");
        System.out.println("Toi da chon mot so tu 1 den 50. Hay thu doan no!");
        while (soDoan != soCanDoan) {
            System.out.print("Nhap so ban doan: ");
            soDoan = scanner.nextInt();

            if (soDoan > soCanDoan) {
                System.out.println("So ban doan lon hon. Thu lai.");
            } else if (soDoan < soCanDoan) {
                System.out.println("So ban doan nho hon. Thu lai.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so: " + soCanDoan);
            }
        }

       
        scanner.close();
    }
}
