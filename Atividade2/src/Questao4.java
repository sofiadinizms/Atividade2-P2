import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe o primeiro valor
        System.out.println("Insira o primeiro valor:");
        int valor1 = scanner.nextInt();

        //Recebe o segundo valor
        System.out.println("Insira o segundo valor:");
        int valor2 = scanner.nextInt();

        //Checa se são iguais. Se forem iguais, printa a multiplicação deles.
        //Se o número 1 for maior que o 2, printa a subtração
        //Em qualquer outro caso, printa a soma deles
        if (valor1 == valor2) {
            System.out.println("Multiplicação: " + (valor1 * valor2));
        } else if (valor1 > valor2) {
            System.out.println("Subtração: " + (valor1 - valor2));
        } else {
            System.out.println("Soma: " + (valor1 + valor2));
        }

        scanner.close();
    }
}

