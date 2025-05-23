package estruturas;

public class Documento { //Representar um documento
    private String nome;
    private int tamanho;

    public Documento(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Documento{" + "nome='" + nome + '\'' + ", tamanho=" + tamanho + '}';
    }
}