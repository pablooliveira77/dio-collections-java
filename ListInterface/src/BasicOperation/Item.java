package BasicOperation;

public class Item {
    // atributos
    private String nome;
    private int preco;
    private double quantidade;

    // construtor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = (int) preco;
        this.quantidade = quantidade;
    }

    // métodos get
    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }
    
}
