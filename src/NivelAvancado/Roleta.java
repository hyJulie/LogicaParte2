package NivelAvancado;

import java.util.Random;
import java.util.Scanner;

public class Roleta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = r.nextInt(37); //de 0 a 36

        System.out.print("Digite quanto quer apostar: ");
        int aposta = scan.nextInt();

        System.out.println("Número sorteado: "+randomNumber);

        scan.close();
    }
}
