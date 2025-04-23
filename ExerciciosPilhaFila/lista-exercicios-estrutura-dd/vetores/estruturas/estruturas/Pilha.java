package estruturas;

public class Pilha<T> {
    private T[] elementos;
    private int topo;

    public Pilha(int tamanho) {
        elementos = (T[]) new Object[tamanho];
        topo = -1;
    }

    public boolean estaVazia() { //Verificador de pilha vazia
        return topo == -1;
    }

    public void empilhar(T elemento) { //Adiciona elemento na pilha
        if (topo == elementos.length - 1) {
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }

    public T desempilhar() { //Remove o elemento 
        return estaVazia() ? null : elementos[topo--];
    }

    public T topo() { //Retorna o elemento do topo
        return estaVazia() ? null : elementos[topo];
    }
}