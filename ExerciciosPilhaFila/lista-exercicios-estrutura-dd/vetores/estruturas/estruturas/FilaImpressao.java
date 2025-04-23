package estruturas;

public class FilaImpressao{
    private Fila<Documento> fila;

    public FilaImpressao(int capacidade) { //Criando a Fila de Impressão
        fila = new Fila<>(capacidade);
    }

    public void adicionarDocumento(Documento doc) { //Adiciona os documentos
        fila.enfileirar(doc);
    }

    public Documento imprimirProximo() {
        if (fila.estaVazia()) { //Verificador lá da Fila.java, precisar ter o "fila."" para não confundir com o pilha
            throw new IllegalStateException("Nenhum documento na fila");
        }
        return fila.desenfileirar();
    }

    public void mostrarFila() {
        System.out.println("Documentos na fila:");
        for (int i = 0; i < fila.tamanho(); i++) { //Repetidor para mostrar um por um
            System.out.println(fila.desenfileirar());
        }
    }
}