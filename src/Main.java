import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;
        int i = 1;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);
    }
}