package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wilian", 123456);
        agendaContatos.adicionarContato("Wilian", 5665);
        agendaContatos.adicionarContato("Wilian Ansanello", 1111111);
        agendaContatos.adicionarContato("Wilian DIO", 654987);
        agendaContatos.adicionarContato("Fabio Marques", 1111111);
        agendaContatos.adicionarContato("Wilian", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Fabio Marques");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Wilian DIO"));
    }


}
