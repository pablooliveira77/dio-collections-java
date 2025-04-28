package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, Double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoaPorAltura, new ComparatorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();

        ordenacao.adicionarPessoa("João", 25, 1.75);
        ordenacao.adicionarPessoa("Maria", 30, 1.65);
        ordenacao.adicionarPessoa("Pedro", 20, 1.80);
        ordenacao.adicionarPessoa("Ana", 28, 1.70);

        System.out.println("Lista ordenada por idade:");
        System.out.println(ordenacao.ordenarPorIdade());

        System.out.println("Lista ordenada por altura:");
        System.out.println(ordenacao.ordenarPorAltura());
    }
}
