package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();

        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }

        return contatosEncontrados;
    }

    public Contato atualizarNumeroPorContato(String nome, int numero) {
        Contato contatoAtualizado = null;

        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Charlie", 555555555);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando contatos que começam com 'A':");
        System.out.println(agenda.pesquisarPorNome("A"));

        System.out.println("\nAtualizando número de contato 'Alice' para 111111111:");
        Contato contatoAtualizado = agenda.atualizarNumeroPorContato("Alice", 111111111);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContatos();
    }
}
