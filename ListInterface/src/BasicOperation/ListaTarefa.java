package BasicOperation;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    // construtor
    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String description) {
        tarefaList.add(new Tarefa(description));
    }

    public void removeTarefa(String description) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescription().equalsIgnoreCase(description)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescriptionTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa(new ArrayList<>());

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Revisar conceitos");

        System.out.println("Número total de tarefas: " + lista.obterNumeroTotalTarefas());

        System.out.println("Lista de tarefas:");
        lista.obterDescriptionTarefas();

        lista.removeTarefa("Fazer exercícios");

        System.out.println("Número total de tarefas após remoção: " + lista.obterNumeroTotalTarefas());
    }
}
