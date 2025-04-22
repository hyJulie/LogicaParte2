package NivelAvancado;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância em Km: ");
        int distancia = scan.nextInt();

        double kmParaM = distancia * 1000;

        double kmParaMilhas = distancia *  0.621371;

        double kmParaJardas = distancia * 1093.61;

        System.out.println("Quilômetros para metros: "+kmParaM+" metros");
        System.out.printf("Quilômetros para milhas:%.2f milhas%n",kmParaMilhas);
        System.out.printf("Quilômetros para jardas: %.2f jardas%n",kmParaJardas);

        scan.close();
    }
}
