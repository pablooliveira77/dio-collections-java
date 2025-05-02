package BasicOperation;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(List<Item> itemList) {
        this.itemList = new ArrayList<>();
    }

    private void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    private void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();

        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }

        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho:");
        for (Item item : itemList) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: "
                    + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new ArrayList<>());
        carrinho.adicionarItem("Produto 1", 10.0, 2);
        carrinho.adicionarItem("Produto 2", 20.0, 1);
        carrinho.adicionarItem("Produto 3", 15.0, 3);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());
        System.out.println();

        carrinho.removerItem("Produto 2");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho após remoção: " + carrinho.calcularValorTotal());
    }
}
