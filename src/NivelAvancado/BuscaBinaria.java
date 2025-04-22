package NivelAvancado;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("Array disponível: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.print("\nDigite qual número quer encontrar: ");
        int alvo = scan.nextInt();

        int resultado = buscaBinaria(numeros, alvo);

        if (resultado != -1) {
            System.out.println("Resultado encontrado na posição: " + resultado);
        }else {
            System.out.println("Elemento não encontrado!");
        }


        scan.close();

    }

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }

        }
        return -1;
    }
}
/*
o método “dividir e conquistar” implementado pela Pesquisa Binária é muito mais eficiente
e preferível para programadores com complexidade de tempo e espaço em mente.
Busca binária => um array é repetidamente dividido em duas metades até que a chave (elemento que está sendo buscado) seja encontrada.

 Se o valor for igual à chave que estamos procurando, o loop ou função recursiva termina.
 Caso contrário, ele continua em loop. Se o valor do meio for maior que a chave, a função se concentrará na primeira metade da matriz e vice-versa.
 Esse processo é repetido até que a chave seja encontrada ou todo o array tenha sido iterado.
 */