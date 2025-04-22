package NivelAvancado;

import java.util.Scanner;

public class PalindromoComN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        String numeroInvertido = Integer.toString(numero);

        StringBuilder builder = new StringBuilder(numeroInvertido).reverse();

        if (numeroInvertido.contentEquals(builder)){
            System.out.println("é um palíndromo");
        }else {
            System.out.println("Não é um palindromo");
        }

        scan.close();
    }
}
/*
O método .contentEquals() já permite comparar uma String com um StringBuilder ou CharSequence sem precisar converter.
 */