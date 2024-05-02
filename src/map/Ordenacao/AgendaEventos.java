package map.Ordenacao;

import java.time.LocalDate;

import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet =  eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();
        eventosMap.get();*/
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
            break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.OCTOBER, 26), "Monsters of Rock", "Metallica");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 10, 22), "Lollapalooza", "Foo Fighters");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.MARCH, 8), "Rock in Rio", "Queen");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 25), "Concerto", "Lulu Santos");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 26), "Concerto 2", "Anitta");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
