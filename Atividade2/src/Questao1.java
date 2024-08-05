import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coleta o primeiro número
        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        //Coleta o segundo número
        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        //Checa se o primeiro numero é maior que o segundo
        if (numero1 > numero2) {
            System.out.println("O maior é: " + numero1);
        } else if (numero2 > numero1) {
            //Checa se o segundo número é maior que o primeiro
            System.out.println("O maior é: " + numero2);
        } else {
            //Se nenhum for maior que o outro eles são iguais
            System.out.println("Os números são iguais");
        }

        scanner.close();
    }
}