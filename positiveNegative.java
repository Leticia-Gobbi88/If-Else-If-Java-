import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value;

        System.out.print("Digite um valor: ");
        value = scanner.nextDouble();

        if (value > 0) {
            System.out.println("O valor é positivo.");
        } else if (value < 0) {
            System.out.println("O valor é negativo.");
        }  else {
            System.out.println("O valor é zero.");
        }



        scanner.close();
    }
}
