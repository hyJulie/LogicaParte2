package NivelAvancado;

import java.util.ArrayList;

public class Fila {
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
        minhaFila<String> fila = new minhaFila<>();

        fila.enqueue("Ana");
        fila.enqueue("Bruna");
        fila.enqueue("Carla");

        System.out.println("Primeiro da fila: "+fila.peek());
        System.out.println("Removido: "+fila.dequeue());
        System.out.println("Agora na fila: "+fila.peek());
        System.out.println("Tamanho da fila: "+fila.tamanho());
    }
}
/*
Uma fila funciona como uma fila de pessoas no banco, no supermercado, etc.

Quem entra primeiro, sai primeiro.
Por isso chamamos de FIFO: First In, First Out.

Imagine que você tenha pessoas chegando assim: Ana → Bruno → Carla.
Elas são atendidas nessa mesma ordem: Ana (primeiro), depois Bruno, depois Carla.

1. enqueue (ou adicionar/entrar na fila):
Serve para inserir um novo item no fim da fila.
Exemplo: se a fila está vazia e alguém chega, essa pessoa vai pro fim.

2. dequeue (ou remover/sair da fila):
Serve para remover o item que está na frente da fila.
Exemplo: quem está há mais tempo na fila é atendido e sai.

3. peek (ou espiar):
Serve para ver quem está na frente da fila, sem remover.

Exemplo: você olha quem é o próximo a ser atendido, mas ainda não chama essa pessoa.
 */