package NivelIniciante;

import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scan.nextInt();

        scan.nextLine();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i; //somar com o número atual da contagem
        }
        System.out.println("Valor da soma: " + soma);
        scan.close();
    }
}
