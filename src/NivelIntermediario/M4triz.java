package NivelIntermediario;

import java.util.Arrays;
import java.util.Scanner;

public class M4triz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        int soma = 0;

        System.out.println("Digite os 16 elementos da matriz 4x4: ");
        for (int i = 0; i < 4;i++){
            for (int j = 0; j < 4; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz){
            for (int[] valor : matriz){
                System.out.println(Arrays.toString(valor));
            }
            System.out.println();
        }

        System.out.println("Diagonal principal");
        for (int i = 0; i < 4;i++){
            System.out.println(matriz[i][i]+" ");
        }

        System.out.println("Soma dos elementos: "+soma);

        scan.close();
    }
}
