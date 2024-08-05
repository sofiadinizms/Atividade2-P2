import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coleta o primeiro número
        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        //Coleta o segundo número
        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        //Coleta o terceiro número
        System.out.println("Insira o terceiro número:");
        int numero3 = scanner.nextInt();

        //Checa se eles atendem a condição
        if (numero1 > numero2 && numero1 > numero3 && numero1 != numero2 && numero1 != numero3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }
}

