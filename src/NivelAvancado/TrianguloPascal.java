package NivelAvancado;

import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = scan.nextInt();

        int[][] triangulo = new int[n][n];

        for (int i = 0; i < n; i++) {

            triangulo[i][0] = 1; //cada linha começa com 1
            triangulo[i][i] = 1; //e vai terminar com 1 tbm

            for (int j = 1; j < i; j++) {//vai preencher as linhas do meio
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j]; // números do meio são a soma de dois números acima
            }
        }

        for (int i = 0; i < n; i++){ //iprimir o triangulo
            for (int j = 0; j < n - i; j++){ //espaço para centralizar
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(triangulo[i][j]+" ");
            }
            System.out.println();
        }

        scan.close();
    }
}
/*
representa o número da coluna, iniciando a contagem a partir do zero

 Para centralizar o triângulo corretamente, você precisa diminuir a quantidade de espaços conforme a linha vai aumentando

 explicão:
        Cada célula [i][j] está somando os dois valores de cima:

            Um à esquerda → [i - 1][j - 1]

            Um à direita → [i - 1][j]
 */