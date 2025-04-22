package NivelAvancado;

import java.util.Scanner;

public class MediaPonderadaPeso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[4];
        double[] pesos = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digita a nota " + (i + 1) + " :");
            notas[i] = scan.nextDouble();

            scan.nextLine();

            System.out.print("Digite o peso da nota " + (i + 1) + " :");
            pesos[i] = scan.nextInt();

        }

        double somaMediasPonderadas = 0;
        double somaPesos = 0;

        for (int i = 0; i < 4; i++) {
            somaMediasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaMediasPonderadas / somaPesos;

        System.out.printf("Média Ponderada: %.2f%n", mediaPonderada);

        scan.close();
    }
}
