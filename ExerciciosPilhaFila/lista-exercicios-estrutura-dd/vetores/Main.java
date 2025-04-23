import estruturas.*;

public class Main {
    public static void main(String[] args) {
        // EditorTexto
        EditorTexto editor = new EditorTexto();
        editor.inserirTexto("Tudu");
        editor.inserirTexto(" Boum?");
        System.out.println("Texto atual: " + editor.getTextoAtual());
        editor.desfazer();
        System.out.println("Após desfazer: " + editor.getTextoAtual());
        editor.refazer();
        System.out.println("Após refazer: " + editor.getTextoAtual());
        

        // Fila de Impressão
        FilaImpressao filaImpressao = new FilaImpressao(5);
        filaImpressao.adicionarDocumento(new Documento("Doc1", 10));
        filaImpressao.adicionarDocumento(new Documento("Doc2", 20));
        System.out.println("Imprimindo: " + filaImpressao.imprimirProximo());
        filaImpressao.mostrarFila();
    }
}