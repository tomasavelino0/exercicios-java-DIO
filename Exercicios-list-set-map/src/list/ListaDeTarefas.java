package list;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
  private ArrayList<Tarefa> tarefas = new ArrayList<>();

  public void adicionarTarefa(String descricao) {
    Tarefa tarefa = new Tarefa(descricao);
    System.out.println("Tarefa Adicionada");
    tarefas.add(tarefa);
  }

  public void removerTarefa(String descricao) {
    for (Tarefa tarefa : tarefas) {
      if (tarefa.getDescricao().equals(descricao)) {
        tarefas.remove(tarefa);
      }
    }
  }

  public int obterNumeroTotalTarefas() {
    System.out.println("Total:" + tarefas.size());
    return tarefas.size();
  }

  public List<String> obterDescricoesTarefas() {
    List<String> listaDescricoes = new ArrayList<>();
    for (Tarefa tarefa : tarefas) {
      listaDescricoes.add(tarefa.getDescricao());
    }
    System.out.println(listaDescricoes);
    return listaDescricoes;
  }


}
