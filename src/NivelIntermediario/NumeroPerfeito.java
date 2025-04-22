package NivelIntermediario;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número e descubra se ele é um número perfeito ou digite 0 para sair: ");
            int num = scan.nextInt();

            if (num <= 0) {
                System.out.println("Encerrando....");
                break;
            }

            int soma = 0;
            StringBuilder divisores = new StringBuilder(" "); //vai armazenar os divisores próprios em forma de texto

            for (int i = 1; i < num; i++) {
                if (num % i == 0) { //se i for divisor de num
                    soma += i;
                    divisores.append(i).append(" "); //somamos ele e adicionamos ao texto dos divisores.
                }
            }

            System.out.println("Divisores de "+num+" : "+ divisores.toString().trim()); //StringBuilder para String e trim tira os espaços vazios

            if (soma == num){
                System.out.println(num+" é um número perfeito");
            }else {
                System.out.println(num+" não é um número perfeito");
            }
        }

        scan.close();
    }
}
/*
Um número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo ele mesmo).

String é imutável, ou seja: cada vez que você faz +=, o Java cria uma nova string por trás, o que pode pesar em loops grandes.
StringBuilder é mutável, então ele só vai adicionando na mesma estrutura, sem recriar tudo a cada passo.
 */