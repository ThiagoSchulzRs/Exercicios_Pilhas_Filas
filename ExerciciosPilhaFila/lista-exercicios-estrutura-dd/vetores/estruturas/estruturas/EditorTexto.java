package estruturas;

public class EditorTexto {
    private String textoAtual = "";
    private Pilha<String> pilhaDesfazer = new Pilha<>(10);
    private Pilha<String> pilhaRefazer = new Pilha<>(10);

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        textoAtual += novoTexto;
        pilhaRefazer = new Pilha<>(10); // Limpa a pilha de refazer
    }

    public void desfazer() { 
        if (!pilhaDesfazer.estaVazia()) { // Verifica se a pilha de desfazer não está vazia
            pilhaRefazer.empilhar(textoAtual); // Adiciona o texto atual na pilha de refazer 
            textoAtual = pilhaDesfazer.desempilhar(); // Desempilha o último texto
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual); // Adiciona o texto atual na pilha de desfazer
            textoAtual = pilhaRefazer.desempilhar(); // Desempilha o último texto
        }
    }

    public String getTextoAtual() {
        return textoAtual;
    }
}
