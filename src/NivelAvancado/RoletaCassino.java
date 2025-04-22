package NivelAvancado;

import java.util.Random;
import java.util.Scanner;

public class RoletaCassino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

      int saldo = 100; //saldo inicial

        System.out.println("Bem-Vindo(a) ao Cassino da sorte");
        System.out.println("Você vai começar com R$"+saldo+" de saldo");

        while (saldo > 0){
            System.out.println("\n Seu saldo atual: "+saldo);
            System.out.print("Digite o valor que quer apostar ou digite 0 para sair: ");
            int apostaValor = scan.nextInt();

            if (apostaValor == 0){
                System.out.println("Você saiu do jogo com R$"+saldo+" de saldo.");
                break;
            }

            if (apostaValor > saldo){
                System.out.println("Aposta inválida, você não pode apostar mais do que tem!!");
                continue;
            }

            System.out.print("Escolha um numero de 0 a 36: ");
            int numeroEscolhido = scan.nextInt();

            if (numeroEscolhido < 0 || numeroEscolhido > 36){
                System.out.println("Número inválido, escolha um número válido entre 0 a 36!");
                continue;
            }

            int numeroSorteado = r.nextInt(37);
            System.out.println("Número sorteado na roleta: "+numeroSorteado);

            if (numeroEscolhido == numeroSorteado){
                int premio = apostaValor * 36;
                saldo += premio; //vai aumentar o saldo com o valor do premio ganho
                System.out.println("Parabéns você ganhou R$"+premio);
            }else {
                saldo -= apostaValor;
                System.out.println("Você perdeu R$"+apostaValor+" hahahahahahahaha");
            }
        }

        if (saldo == 0){
            System.out.println("Você ficou sem saldo. Vaza daqui :/");
        }

        scan.close();
    }
}
