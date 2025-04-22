package NivelIntermediario;

import java.util.Scanner;

public class CountCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        palavra = palavra.toLowerCase().replaceAll("[^a-z]", "");

        System.out.println("Qual letra você quer contar? ");
        char letraDigitada = scan.nextLine().charAt(0);

        int countCaracteres = 0;

        for (int i = 0; i < palavra.length();i++){
            char letra = palavra.charAt(i);

            if (letra == letraDigitada){
                countCaracteres++;
            }
        }

        System.out.println("A letra "+letraDigitada+" aparece: "+countCaracteres+" vezes");

        scan.close();
    }
}
