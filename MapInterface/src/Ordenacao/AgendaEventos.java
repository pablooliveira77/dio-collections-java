package Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgendas() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        System.out.println(eventosOrdenados);
    }

    public void proximoEvento() {
        LocalDate dataNow = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if (entry.getKey().isAfter(dataNow) || entry.getKey().isEqual(dataNow)) {
                System.out.println("Próximo evento: " + entry.getValue());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2025, 6, 11), "Show de Rock", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2025, 6, 5), "Festival de Jazz", "Artista Y");
        agenda.adicionarEvento(LocalDate.of(2025, 6, 10), "Teatro", "Peça Z");

        System.out.println("Eventos na agenda:");
        agenda.exibirAgendas();

        agenda.proximoEvento();
    }
}
