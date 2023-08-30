package list;

public class Main {

  public static void main(String[] args) {
    ListaDeTarefas lt = new ListaDeTarefas();
    lt.adicionarTarefa("Estudar");
    lt.adicionarTarefa("Estudar");
    lt.adicionarTarefa("Correr");
    lt.obterDescricoesTarefas();
    lt.removerTarefa("Estudar");
    lt.obterDescricoesTarefas();
    lt.obterNumeroTotalTarefas();
  }

}
