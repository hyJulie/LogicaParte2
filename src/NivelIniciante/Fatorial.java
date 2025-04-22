package NivelIniciante;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int n = scan.nextInt();
        scan.nextLine();

        int fatorial = 1;

        for (int i = 1; i <= n ;i++){
            fatorial *= i;
        }
        System.out.println("Fatorial de " + n + " é: " + fatorial);
        scan.close();
    }
}
