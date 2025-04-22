package NivelAvancado;

import java.util.ArrayList;
import java.util.Scanner;

public class FilaScanner {
    static class minhaFila<T>{
        private ArrayList<T> elementos;

        public minhaFila(){
            elementos = new ArrayList<>();
        }

        public void enqueue(T elemento){
            elementos.add(elemento);
        }

        public T dequeue(){
            if (estaVazia()){
                System.out.println("A fila está vazia!");
                return null;
            }
            return elementos.removeFirst();
        }

        public T peek() {
            if (estaVazia()) {
                System.out.println("A fila está vazia!");
                return null;
            }
            return elementos.getFirst();
        }

        public boolean estaVazia(){
            return elementos.isEmpty();
        }

        public int tamanho(){
            return elementos.size();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        minhaFila<String> fila = new minhaFila<>();

        int opcao;
        do {
            System.out.println("==MENU FILA==");
            System.out.println("1 - Adicionar");
            System.out.println("2 - remover (dequeue)");
            System.out.println("3 - espiar (peek)");
            System.out.println("4 - ver tamanho da fila");
            System.out.println("5 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o elemento a ser adicionado: ");
                    String elemento = scan.nextLine();
                    fila.enqueue(elemento);
                    System.out.println("Elemeto adicionado com sucesso");
                    break;
                case 2:
                    String removido = fila.dequeue();
                    if (removido != null){
                        System.out.println("Elemento removido: "+removido);
                    }
                    break;
                case 3:
                    String primeiro = fila.peek();
                    if (primeiro != null){
                        System.out.println("Elemento da frente: "+primeiro);
                    }
                    break;
                case 4:
                    System.out.println("Tamanho da fila: "+ fila.tamanho());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while (opcao != 5);

        scan.close();
    }
}
