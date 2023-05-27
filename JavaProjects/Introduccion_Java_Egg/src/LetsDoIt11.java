import java.util.Scanner;

public class LetsDoIt11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of characters ending in period(.):");
        String sequence = scanner.nextLine();

        String coding = encodeSequence(sequence);

        System.out.println("Codificación: " + coding);
    }

    public static String encodeSequence(String sequence) {
        StringBuffer coding = new StringBuffer();

        for (int i = 0; i < sequence.length(); i++) {
            char characterText = sequence.charAt(i);

            switch (Character.toLowerCase(characterText)) {
                case 'a':
                    coding .append('@');
                    break;
                case 'e':
                    coding .append('#');
                    break;
                case 'i':
                    coding .append('$');
                    break;
                case 'o':
                    coding .append('%');
                    break;
                case 'u':
                    coding .append('*');
                    break;
                default:
                    coding .append(characterText);
                    break;
            }
        }

        return coding.toString();
    }
}
