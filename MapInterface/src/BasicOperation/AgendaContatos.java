package BasicOperation;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        // Inicializa a agenda de contatos
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if (!contatos.isEmpty()) {
            numeroPorNome = contatos.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Pedro", 555555555);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando por João:");
        Integer numeroJoao = agenda.pesquisarPorNome("João");
        if (numeroJoao != null) {
            System.out.println("Número de João: " + numeroJoao);
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nRemovendo contato de Maria...");
        agenda.removerContato("Maria");

        System.out.println("\nContatos na agenda após remoção:");
        agenda.exibirContatos();
        
        System.out.println("\nAdicionando Novo João:");
        agenda.adicionarContato("João", 111111111);
        
        System.out.println("\nContatos na agenda após Adição do João:");
        agenda.exibirContatos();
    }
}
