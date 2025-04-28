package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, String anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        if (!livrosList.isEmpty()) {

            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(livro);
                }
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicio, int anoFim) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        if (!livrosList.isEmpty()) {

            for (Livro livro : livrosList) {
                int anoPublicacao = Integer.parseInt(livro.getAnoPublicacao());
                if (anoPublicacao >= anoInicio && anoPublicacao <= anoFim) {
                    livrosEncontrados.add(livro);
                }
            }
        }

        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "1954");
        catalogo.adicionarLivro("1984", "George Orwell", "1949");
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", "1899");

        System.out.println("Pesquisando livros do autor 'George Orwell':");
        List<Livro> livrosPorAutor = catalogo.pesquisarAutor("George Orwell");
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro);
        }

        System.out.println("\nPesquisando livros publicados entre 1900 e 2000:");
        List<Livro> livrosPorAno = catalogo.pesquisarPorIntervaloDeAno(1900, 2000);
        for (Livro livro : livrosPorAno) {
            System.out.println(livro);
        }

        System.out.println("\nPesquisando livro com o título 'Dom Casmurro':");
        Livro livroPorTitulo = catalogo.pesquisarPorTitulo("Dom Casmurro");
        if (livroPorTitulo != null) {
            System.out.println(livroPorTitulo);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
