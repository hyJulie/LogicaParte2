package NivelIniciante;

import java.util.Scanner;

public class MultiplicacaoSemAsterisco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();

        scan.nextLine();

        int resultado = 0;

        //aqui vai verificar se um dos dois é negativo
        boolean negativo = (a < 0) ^ (b < 0); //verdadeiro apenas se um dos dois for negativo

        // valores absolutos
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        //aqui vai ser a soma repetida, adição repetida
        for (int i = 0; i < absA; i++) {
            resultado += absB;
        }

        if (negativo){
            resultado = -resultado;
        }

        System.out.println("Resultado da multiplicação: "+resultado);
        scan.close();
    }
}
/*
Adição repetida
    3  *  4 = mesmo que 4 + 4 + 4 = 12
    a  *  b
    vai ser o b somado a ele mesmo em a repetidas vezes
 */