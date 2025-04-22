package NivelIniciante;

import java.util.Scanner;

public class VogaisConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vogais = "aeiou";

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        palavra = palavra.toLowerCase().replaceAll("[^a-z]", ""); //remove tudo que não for letra minúscula ou número

        int countVogais = 0;
        int countConsoantes = 0;


        for (int i = 0; i < palavra.length();i++){
            char letra = palavra.charAt(i);

            if (vogais.contains(letra + "")){
                countVogais++;
            }else {
                countConsoantes++;
            }
        }

        System.out.println("Vogais de "+palavra+" : "+countVogais);
        System.out.println("Consoantes de "+palavra+" : "+countConsoantes);


        scan.close();
    }
}
/*
Character.isLetter() é um método do Java que verifica se um caractere é uma letra
 */