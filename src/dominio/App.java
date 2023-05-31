
package dominio;

import java.util.Calendar;

public class App {

  public static void main(String[] args) {

    Endereco endCliente = new Endereco("Trump Tower", "Fiusa", "123",
        "Serrana", "SP", "14021615");

    Calendar dataNascimento = Calendar.getInstance();
    dataNascimento.set(Calendar.YEAR, 1995);
    dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
    dataNascimento.set(Calendar.DAY_OF_MONTH, 20);

    Cliente cliente = new Cliente("Viuva Negra",
      "Natasha Romananof",
      endCliente,
      "8887877",
      dataNascimento,
      "3351212",
      "3212",
      "natasha@reges.edu.br",
      "121212");

    Endereco endFuncionario = new Endereco("Vingadores Tower",
      "João Rossi",
      "9888",
      "Serrana",
      "SP",
      "14021618");

    Calendar dataNasFunc = Calendar.getInstance();
    dataNasFunc.set(Calendar.YEAR, 1995);
    dataNasFunc.set(Calendar.MONTH, Calendar.MARCH);
    dataNasFunc.set(Calendar.DAY_OF_MONTH, 20);

    Funcionario funcionario = new Funcionario("Gavião Arqueiro",
      "Clinton Barton",
      endFuncionario,
      "3212121",
      dataNasFunc,
      "321212",
      "321212",
      "clint@reges.edu.br",
      4,
      888880,
      "Arqueiro",
      80);

    Endereco endFornecedor = new Endereco("Reges Tower",
      "Olhos d'agua",
      "9888",
      "Serrana",
      "SP",
      "14021618");

    Calendar dataNasForn = Calendar.getInstance();
    dataNasForn.set(Calendar.YEAR, 1995);
    dataNasForn.set(Calendar.MONTH, Calendar.MARCH);
    dataNasForn.set(Calendar.DAY_OF_MONTH, 20);

    Fornecedor fornecedor = new Fornecedor("Gavião Arqueiro",
      "Clinton Barton",
      endFornecedor,
      "3212121",
      dataNasFunc,
      "321212",
      "321212",
      "clint@reges.edu.br");

    Produto prod1 = new Produto("Cerveja Delirium", 10, "123456", 15, 50, "Ambev", "123", fornecedor);
    Produto prod2 = new Produto("Samba", 88, "a988478", 2, 53, "Ambev", "123", fornecedor);
    Produto prod3 = new Produto("Cerveja Samba", 777, "122121", 35, 70, "Ambev", "123", fornecedor);
    Produto prod4 = new Produto("Cerveja SubZero", 8880, "554546", 55, 80, "Ambev", "123", fornecedor);

    Calendar dataVenda = Calendar.getInstance();
    dataVenda.set(Calendar.YEAR, 2023);
    dataVenda.set(Calendar.MONTH, Calendar.MARCH);
    dataVenda.set(Calendar.DAY_OF_MONTH, 20);

    Compra compra = new Compra(cliente, funcionario, 12, dataVenda);

    ItemCompra item1 = new ItemCompra(compra, prod1, 15.0, 52.50);
    ItemCompra item2 = new ItemCompra(compra, prod2, 35.0, 2.50);
    ItemCompra item3 = new ItemCompra(compra, prod3, 45.0, 5.50);
    ItemCompra item4 = new ItemCompra(compra, prod4, 55.0, 6.50);

    compra.adicionarItemCompra(item1);
    compra.adicionarItemCompra(item2);
    compra.adicionarItemCompra(item3);
    compra.adicionarItemCompra(item4);

    compra.imprimirCupomFiscal();
  }
}
