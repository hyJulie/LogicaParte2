package NivelIntermediario;

import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que quer exibir: ");
        int num = scan.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < num; i++){
            System.out.println(a+" ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        scan.close();
    }
}
