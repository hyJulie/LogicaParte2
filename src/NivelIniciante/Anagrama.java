package NivelIniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine().trim().toLowerCase();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine().trim().toLowerCase();

        if (palavra1.length() == palavra2.length()){
            char[] letras1 = palavra1.toCharArray();
            char[] letras2 = palavra2.toCharArray();

            Arrays.sort(letras1);
            Arrays.sort(letras2);

            if (Arrays.equals(letras1,letras2)){
                System.out.println("São anagramas");
            }else {
                System.out.println("Não são anagramas");
            }
        }else {
            System.out.println("Não são anagramas");
        }


        scan.close();
    }
}
