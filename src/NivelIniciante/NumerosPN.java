package NivelIniciante;

import java.util.Scanner;

public class NumerosPN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPositivos = 0;
        int countNegativos = 0;

        for (int i = 0; i < 10;i++){
            System.out.print("Digite o "+(i + 1)+" número: ");
            int num = scan.nextInt();
            scan.nextLine();

            if (num > 0){
                countPositivos++;
            }else if (num < 0){
                countNegativos++;
            }else {
                System.out.println(" ");
            }
        }

        System.out.println("Números positivos: "+countPositivos);
        System.out.println("Números negativos: "+countNegativos);

        scan.close();
    }
}
