import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numberOne;
        double numberTwo;

        System.out.println("\nVerifique se o número é maior ou menor que!\n");

        System.out.print("Por favor insira o primeiro valor: ");
        numberOne = scanner.nextShort();

        System.out.print("Por favor insira o segundo valor: ");
        numberTwo = scanner.nextShort();


        if (numberOne > numberTwo) {
            System.out.println("O valor: " + (numberOne) + " é maior que o valor: " + (numberTwo));
        }   else { System.out.println("O valor: " +(numberOne) + " é menor que o valor: " +(numberTwo));
        }

        scanner.close();
    }
}
