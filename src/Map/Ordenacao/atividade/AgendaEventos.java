package Map.Ordenacao.atividade;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    //Atributos (um Map de data e da classe Evento
    private Map<LocalDate, Evento> eventosMap;

    //Contrutor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //METODOS
    //Adiciona um evento à agenda.
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //instanciando o Evento
        Evento evento = new Evento(nome, atracao);
        //adicionando um evento(nome e atracao)
        eventosMap.put(data, evento);

        //outra forma mais simplificada:
        //eventosMap.put(data, new Evento(nome, atracao));
    }

    //Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda(){
        //Tree Map para comparação de datas
        //Esta organizado em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    //Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento(){
       // Set<LocalDate> dateSet = eventosMap.keySet();  //retorna um set com todas as chaves/Keys
       // Collection<Evento> values = eventosMap.values(); // retorna uma coleção com todos os valores
       // eventosMap.get(); // retorna um valor com base na key que tenho que informar

        LocalDate dataAtual = LocalDate.now();  // retorna a data atual
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);  //retorna as datas em ordem crescente
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){  //entrySet retorna um set que tem obejtos do tipo Map.entry(key e valor)
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }


    //TESTE
    public static void main(String[] args) {
        //instanciando a agenda Eventos
        AgendaEventos agendaEventos = new AgendaEventos();

        //Adicionando evento
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 30), "Consulta", "Ultrasson");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 18), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 24), "Evento 5", "Atração 5");

        //Exibir
        agendaEventos.exibirAgenda();

        //Proximo Evento
        agendaEventos.obterProximoEvento();

    }
}














