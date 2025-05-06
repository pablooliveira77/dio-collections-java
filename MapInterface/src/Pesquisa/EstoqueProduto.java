package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProduto() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long id, String nome, Double preco, int quantidade) {
        estoqueProdutos.put(id, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calculaValorTotalEstoque() {
        double valorTotal = 0.0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                if (produto.getPreco() > precoMaisCaro) {
                    precoMaisCaro = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(1L, "Produto A", 10.0, 5);
        estoque.adicionarProduto(2L, "Produto B", 25.0, 1);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 10);
        estoque.adicionarProduto(4L, "Produto D", 21.0, 5);

        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        System.out.println("\nValor total do estoque: " + estoque.calculaValorTotalEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        if (produtoMaisCaro != null) {
            System.out.println("\nProduto mais caro: " + produtoMaisCaro);
        } else {
            System.out.println("Nenhum produto encontrado.");
        }
    }
}
