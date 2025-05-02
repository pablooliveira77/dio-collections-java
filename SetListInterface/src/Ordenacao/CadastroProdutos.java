package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosOrdenados = new TreeSet<>(produtos);
        return produtosOrdenados;
    }

    public Set<Produto> exibirProdutoPorPreco() {
       Set<Produto> produtosOrdenados = new TreeSet<>(new ComparadorPreco());
        produtosOrdenados.addAll(produtos);
        return produtosOrdenados;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 20.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 15.0, 8);

        System.out.println("Produtos ordenados por nome:");
        for (Produto produto : cadastro.exibirProdutoPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto produto : cadastro.exibirProdutoPorPreco()) {
            System.out.println(produto);
        }
    }
}
