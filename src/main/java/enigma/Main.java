package enigma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Enigma e = new Enigma(1000000);

        Scanner s = new Scanner(System.in);

        System.out.print("input string: ");
        String inputString = s.nextLine();
        System.out.println();

        String encryptedString = e.encryptString(inputString);
        System.out.println("after encryption: " + encryptedString);

        String decryptedString = e.decryptString(encryptedString);
        System.out.println("after decryption: " + decryptedString);

    }
}
