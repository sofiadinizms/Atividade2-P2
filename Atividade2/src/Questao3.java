import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coleta o numero
        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        //Checa se a divisão dele por 2 tem resto 0, ou seja, se ele é par + printa o resultado
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        scanner.close();
    }
}
