package List.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();  //criou uma lista com tarefas para remover
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){   //se a descrição da tarefa for igual a descrição passada vai remover)
                tarefasParaRemover.add(t);                        //add toda descrição igual na lista
            }
        }
        tarefaList.removeAll(tarefasParaRemover); //removar a lista toda
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        //objeto de listaTarefa
        ListaTarefas listaTarefas= new ListaTarefas();
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        //Adicionar Tarefa
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        //Remover tarefa
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        //obter descrição
        listaTarefas.obterDescricoesTarefas();

    }
}
