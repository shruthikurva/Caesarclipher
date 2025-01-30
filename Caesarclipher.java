    import java.util.Scanner;
   public class Caesarclipher {
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                c = (char) (((c - 'a' + shift) % 26) + 'a');
            }
            else if (Character.isUpperCase(c)) {
                c = (char) (((c - 'A' + shift) % 26) + 'A');
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter shift: ");
        int shift = sc.nextInt();
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        sc.close();
    }
}

