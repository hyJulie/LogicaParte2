package NivelIniciante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElementosDuplicados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números por espaço: ");
        String entrada = scan.nextLine(); //vai ler a linha inteira

        String[] partes = entrada.split(" "); //vai dar espaço
        int[] numeros = new int[partes.length]; //vai criar o array do tamanho certinho

        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]); //vai transformar o array de string para numero inteiro
        }

        System.out.println("Números digitados: ");
        for (int num : numeros) {
            System.out.println(num + " ");
        }

        System.out.println("Números sem repetição: ");
        Set<Integer> unicos = new HashSet<>();
        for (int num : numeros) {
            if (!unicos.contains(num)){
                System.out.println(num+" ");
                unicos.add(num); //adiciona para lembrar que ja apareceu
            }
        }
            scan.close();
        }
    }
/*
 Set é uma estrutura do Java que não permite elementos repetidos.
 */