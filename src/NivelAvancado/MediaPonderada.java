package NivelAvancado;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] pesos = {2, 3, 4, 6};

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();

        double[] notas = {nota1, nota2, nota3, nota4};

        double somaMediaPonderada = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) { //aqui vai multiplicar nota pelo peso de cada posição, e acumula os valores
            somaMediaPonderada += notas[i] * pesos[i]; //somando em somaMediaPonderada
            somaPesos += pesos[i];// e somando os pesos
        }

        double mediaPonderada = somaMediaPonderada / somaPesos;

        System.out.printf("Média ponderada: %.2f%n", mediaPonderada);

        scan.close();

    }
}
