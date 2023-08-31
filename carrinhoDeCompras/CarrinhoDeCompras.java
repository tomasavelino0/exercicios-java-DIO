package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> carrinho = new ArrayList<>();

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item newItem = new Item(nome, preco, quantidade);
    carrinho.add(newItem);
  }

  public void removerItem(String nome) {
    for (Item item : carrinho) {
      if (item.getNome().equals(nome)) {
        carrinho.remove(item);
      }
    }
  }

  public double calcularValorTotal() {
    double total = 0;
    for (Item item : carrinho) {
      double preco = item.getPreco();
      int qt = item.getQuantidade();
      total += preco * qt;
    }
    System.out.println("Valor Total: " + total);
    return total;
  }

  public List<String> exibirItens() {
    List<String> itens = new ArrayList<>();
    for (Item item : carrinho) {
      var itemInfo = "\nnome: " + item.getNome() + "\npreco: " + item.getPreco() + "\nquantidade: "
          + item.getQuantidade();

      itens.add(itemInfo);
    }
    System.out.println(itens);
    return itens;
  }

  public List<Item> getCarrinho() {
    return carrinho;
  }

  public void setCarrinho(List<Item> carrinho) {
    this.carrinho = carrinho;
  }

}
