import java.util.Scanner;

public class vogalConsoante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter;

        System.out.print("Digite uma letra do alfabeto: ");
        letter = scanner.next().charAt(0);

            if (letter == 'a' || letter == 'A' ||
                letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' ||
                letter == 'o' || letter == 'O' ||
                letter == 'u' || letter == 'U')
            { System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }



        scanner.close();
    }
}
