package NivelIntermediario;

public class Ordenacao {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 4, 1};

        for (int i = 0; i < numeros.length - 1; i++) { // passada externa e vai controlar quantas vezes o array será percorrido
            for (int j = 0; j < numeros.length - 1 - i; j++) { //passada interna e compara os elementos lado a lado e troca, se necessário
                if (numeros[j] > numeros[j + 1]) {
                    //aqui vai rolar a troca
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array Ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

    }
}
/*
Explicação do BubbleSort :
        Você compara dois elementos vizinhos do array.

        Se o da esquerda for maior que o da direita, você troca os dois de lugar.

        Você continua fazendo isso até o final do array.

        Isso foi uma passada (um "passe").

        Agora você repete o processo várias vezes. A cada nova passada, o maior número restante vai sendo colocado no lugar certo (no final).

        Você continua até que nenhuma troca mais seja feita — isso significa que o array está ordenado.

        numbers.lenght - 1 => Se o array tem 4 elementos, faremos 3 passadas (por isso é length - 1)

        numbers.lenght - 1 - i => A parte - i é uma otimização: a cada nova passada, não precisamos comparar os últimos i elementos, porque eles já estão ordenados
 */