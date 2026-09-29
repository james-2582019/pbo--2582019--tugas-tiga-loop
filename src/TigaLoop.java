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
        System.out.println();

        // =====================================================
        // 2. WHILE LOOP
        // =====================================================
        System.out.print("while    : ");

        int j = 1;

        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println();

        // =====================================================
        // 3. DO-WHILE LOOP
        // =====================================================
        System.out.print("do-while : ");

        int k = 1;

        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);

        System.out.println();

        /*
         * HASIL n = 0:
         *
         * for      :
         * while    :
         * do-while : 1
         *
         * Dua baris pertama kosong karena:
         * for dan while mengecek kondisi terlebih dahulu.
         * Saat n = 0, kondisi 1 <= 0 bernilai false,
         * sehingga badan loop tidak dijalankan.
         *
         * Sedangkan do-while menjalankan badan loop terlebih dahulu,
         * baru setelah itu mengecek kondisi.
         * Oleh karena itu, angka 1 tetap dicetak satu kali.
         */

        // =====================================================
        // 4. MEMBUKTIKAN OFF-BY-ONE
        // =====================================================

        int kurang = 0;

        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;

        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // =====================================================
        // 5. CONTINUE DAN BREAK
        // =====================================================

        int jumlahPrintln = 0;

        for (int i = 1; i <= 10; i++) {

            // Lewati angka genap
            if (i % 2 == 0) {
                continue;
            }

            // Berhenti jika i > 7
            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            jumlahPrintln++;
        }

        System.out.println();

        System.out.println("Disaring : 1 3 5 7");
        System.out.println("Sampai println  : " + jumlahPrintln + " kali");

        /*
         * Mengapa loop tidak berhenti di i = 8?
         *
         * Karena saat i = 8, kondisi:
         *
         *     if (i % 2 == 0)
         *
         * bernilai true terlebih dahulu.
         *
         * Akibatnya continue dijalankan dan langsung
         * menuju perulangan berikutnya.
         *
         * Jadi kondisi i > 7 belum sempat diperiksa.
         *
         * Setelah itu i menjadi 9.
         * Pada i = 9, angka tersebut bukan genap,
         * sehingga continue tidak dijalankan.
         * Kemudian kondisi i > 7 diperiksa dan bernilai true,
         * sehingga break menghentikan loop.
         */

        /*
         * Kesimpulan:
         * do-while mengecek kondisinya sesudah badan loop
         * dijalankan, jadi badannya pasti jalan minimal sekali.
         */

        scanner.close();



    }
}