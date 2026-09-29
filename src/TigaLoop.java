import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Meminta batas deret
        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // =====================================================
        // 1. FOR LOOP
        // =====================================================
        System.out.print("for      : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }



    }
}