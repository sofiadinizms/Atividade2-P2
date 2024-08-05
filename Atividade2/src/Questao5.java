import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Printa as opções de operação e recebe a escolha do usuário
        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int operacao = scanner.nextInt();

        //Recebe o primeiro valor
        System.out.println("Insira o primeiro valor:");
        int valor1 = scanner.nextInt();

        //Recebe o segundo valor
        System.out.println("Insira o segundo valor:");
        int valor2 = scanner.nextInt();

        //Execute a operação escolhida pelo usuário com os valores recebidos, printando o resultado
        switch (operacao) {
            case 1:
                System.out.println("Soma: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Subtração: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (valor1 * valor2));
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Divisão por zero.");
                } else {
                    System.out.println("Divisão: " + (valor1 / valor2));
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}

