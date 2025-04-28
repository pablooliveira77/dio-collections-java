package Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;

    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }

}
