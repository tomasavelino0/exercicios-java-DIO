package list;

public class Main {

  public static void main(String[] args) {
    Tarefa t1 = new Tarefa("Estudar");
    Tarefa t2 = new Tarefa("Correr");
    ListaDeTarefas lt = new ListaDeTarefas();
    lt.adicionarTarefa("Estudar");
    lt.adicionarTarefa("Correr");
    lt.obterDescricoesTarefas();
    lt.removerTarefa("Estudar");
    lt.obterNumeroTotalTarefas();
  }

}
