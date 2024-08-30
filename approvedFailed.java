import java.util.Scanner;

public class approvedFailed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do teste: ");
        int scoreTest = scanner.nextInt();



        if (scoreTest >= 7 && scoreTest < 10) {
            System.out.print("Você passou. Parabéns");
        } else if (scoreTest == 10) {
            System.out.print("Você passou com louvor. Parabéns!!");
        } else {
            System.out.print("Você reprovou");
        }


        scanner.close();
    }
}




