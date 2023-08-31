package carrinhoDeCompras;

public class Main {

  public static void main(String[] args) {
    CarrinhoDeCompras cdc = new CarrinhoDeCompras();
    cdc.adicionarItem("Mouse", 140, 1);
    cdc.adicionarItem("Teclado", 200, 2);
    System.out.println(cdc.getCarrinho().size());
    cdc.calcularValorTotal();
    cdc.exibirItens();
    cdc.removerItem("Mouse");
    cdc.exibirItens();
  }

}
