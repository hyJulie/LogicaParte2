package NivelIntermediario;

import java.util.Scanner;

public class OrdenacaoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você quer ordenar? ");
        int tamanho = scan.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("Números antes da ordenação: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números depois da ordenação: ");
        for (int num : numeros){
            System.out.print(num+" ");
        }

        scan.close();
    }
}
