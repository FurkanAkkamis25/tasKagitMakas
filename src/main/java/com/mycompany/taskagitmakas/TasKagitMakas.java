
package com.mycompany.taskagitmakas;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"taş", "kağıt", "makas"};
        int userScore = 0;
        int computerScore = 0;

        while (true) {
            // Kullanıcı seçeneğini almak
            System.out.print("Taş, kağıt veya makas? (Çıkmak için 'çık' yazın): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Kullanıcı çıkmak istiyor mu kontrol etmek
            if (userChoice.equals("çık")) {
                System.out.println("Oyunu sonlandırdınız.");
                break;
            }

            // Bilgisayarın seçimini rastgele yapması
            int randomIndex = (int) (Math.random() * choices.length);
            String computerChoice = choices[randomIndex];

            // Seçimleri ekrana yazdırmak
            System.out.println("Siz: " + userChoice);
            System.out.println("Bilgisayar: " + computerChoice);

            // Kazananı belirlemek
            if (userChoice.equals(computerChoice)) {
                System.out.println("Berabere!");
            } else if ((userChoice.equals("taş") && computerChoice.equals("makas")) ||
                    (userChoice.equals("kağıt") && computerChoice.equals("taş")) ||
                    (userChoice.equals("makas") && computerChoice.equals("kağıt"))) {
                System.out.println("Siz kazandınız!");
                userScore++;
            } else {
                System.out.println("Bilgisayar kazandı!");
                computerScore++;
            }
            System.out.println();
        }

        // Skorları ekrana yazdırmak
        System.out.println("Oyun bitti. Skorlar:");
        System.out.println("Siz: " + userScore);
        System.out.println("Bilgisayar: " + computerScore);

        scanner.close();
    }
}