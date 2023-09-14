package Set.Pesquisa.desafio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    //Atributos
    private Set<Tarefa> listaDeTarefaSet;


    //Construtor
    public ListaTarefas() {
        this.listaDeTarefaSet = new HashSet<>();
    }

    //METODOS
    //Adiciona uma nova tarefa ao Set
    public void adicionarTarefa(String descricao){
        listaDeTarefaSet.add(new Tarefa(descricao));
    }

    //Remove uma tarefa do Set de acordo com a descrição, se estiver presente
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!listaDeTarefaSet.isEmpty()) {
            for (Tarefa t : listaDeTarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                } else {
                    System.out.println("Tarefa não encontrada!");
                }
            }
            listaDeTarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Exibe todas as tarefas da lista de tarefas
    public void exibirTarefas(){
        if (!listaDeTarefaSet.isEmpty()){
            System.out.println(listaDeTarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    //Conta o número total de tarefas na lista de tarefas
    public void contarTarefas(){
        System.out.println(listaDeTarefaSet.size());
    }

    //Retorna um Set com as tarefas concluídas
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaDeTarefaSet) {
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    //Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaDeTarefaSet) {
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    //Marca uma tarefa como concluída de acordo com a descrição.
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listaDeTarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    //Marca uma tarefa como pendente de acordo com a descrição.
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : listaDeTarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null){
            if (tarefaPendente.isConcluida()){
                tarefaPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    //Remove todas as tarefas da lista de tarefas.
    public void limparListaTarefas(){
        if(listaDeTarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            listaDeTarefaSet.clear();
        }
    }

    //TESTES
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        System.out.println("Exibindo as tarefas na lista");
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        System.out.println("\nRemovendo uma tarefa");
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("\nTotal de tarefas na lista: ");
        listaTarefas.contarTarefas();

        // Obtendo tarefas pendentes
        System.out.println("\nObtendo tarefas pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        System.out.println("\nMarcando tarefas como concluídas");
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println("\nObtendo tarefas concluídas");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        System.out.println("\nMarcando tarefas como pendentes");
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        System.out.println("\nLimpando a lista de tarefas");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
