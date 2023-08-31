package carrinhoDeCompras;

public class Item {
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String n, double p, int qt) {
    nome = n;
    preco = p;
    quantidade = qt;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
