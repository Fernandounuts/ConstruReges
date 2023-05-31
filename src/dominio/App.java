
package dominio;

import java.util.Calendar;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Endereço do Cliente
    System.out.println("Bom dia, qual seu logradouro?");
    String logradouro = sc.nextLine();
    System.out.println("Qual o seu endereço?");
    String end = sc.nextLine();
    System.out.println("Qual o seu número?");
    String num = sc.nextLine();
    System.out.println("Qual a sua cidade?");
    String cidade = sc.nextLine();
    System.out.println("Qual a sigla do seu estado?");
    String estado = sc.nextLine();
    System.out.println("Qual o seu CEP?");
    String cep = sc.nextLine();

    Endereco endCliente = new Endereco(logradouro, end, num, cidade, estado, cep);

    // Data de Nascimento do Cliente
    // Dia de Nasc do Cliente
    Calendar dataNascimento = Calendar.getInstance();
    System.out.println("Qual foi o dia de seu nascimento?");
    int dia = sc.nextInt();
    dataNascimento.set(Calendar.DAY_OF_MONTH, dia);

    System.out.println("Qual o seu mês de nascimento?");
    System.out.println("0 = janeiro\n" +
        "1 = fevereiro\n" +
        "2 = março\n" +
        "3 = abril\n" +
        "4 = maio\n" +
        "5 = junho\n" +
        "6 = julho\n" +
        "7 = agosto\n" +
        "8 = setembro\n" +
        "9 = outubro\n" +
        "10 = novembro\n" +
        "11 = dezembro");

    // Mes de Nasc do Cliente
    int mes = sc.nextInt();
    sc.nextLine();
    dataNascimento.set(Calendar.MONTH, mes);

    // Ano de Nasc do Cliente
    System.out.println("Qual foi o ano de seu nascimento?");
    int ano = sc.nextInt();
    sc.nextLine();
    dataNascimento.set(Calendar.YEAR, ano);

    // Dados Cliente
    System.out.println("Qual o seu nome?");
    String nome = sc.nextLine();

    System.out.println("Qual o seu nome resumido?");
    String nomeRes = sc.nextLine();

    System.out.println("Digite o seu telefone:");
    String telefone = sc.nextLine();

    System.out.println("Qual o seu documento?");
    String documento = sc.nextLine();

    System.out.println("Qual seu RGIE?");
    String rgIe = sc.nextLine();

    System.out.println("Digite o seu Email:");
    String email = sc.nextLine();

    System.out.println("Digite seu número do cartão fidelidade:");
    String cartFidel = sc.nextLine();

    Cliente cliente = new Cliente(nome, nomeRes, endCliente, telefone, dataNascimento, documento, rgIe, email, cidade);

    // Endereço do Funcionario
    Endereco endFuncionario = new Endereco(
        "Vingadores Tower",
        "João Rossi",
        "9888",
        "Serrana",
        "SP",
        "14021618");

    Calendar dataNasFunc = Calendar.getInstance();
    dataNasFunc.set(Calendar.YEAR, 1995);
    dataNasFunc.set(Calendar.MONTH, Calendar.MARCH);
    dataNasFunc.set(Calendar.DAY_OF_MONTH, 20);

    System.out.println("Digite o nome do funcionário que te atendeu:");
    String nomeFunc = sc.nextLine();

    System.out.println("Digite o nome resumido do funcionário:");
    String nomeFuncRes = sc.nextLine();

    Funcionario funcionario = new Funcionario(
        nomeFunc,
        nomeFuncRes,
        endFuncionario,
        "3212121",
        dataNasFunc,
        "321212",
        "321212",
        "emailDoFuncionario@exemplo.com",
        4,
        888880,
        "Metaleiro",
        80);

    Endereco endFornecedor = new Endereco(
        "Reges Tower",
        "Nova Aliança",
        "9888",
        "Ribeirão Preto",
        "SP",
        "14021618");

    Calendar dataNasForn = Calendar.getInstance();
    dataNasForn.set(Calendar.YEAR, 1995);
    dataNasForn.set(Calendar.MONTH, Calendar.MARCH);
    dataNasForn.set(Calendar.DAY_OF_MONTH, 20);

    Fornecedor fornecedor = new Fornecedor(
        "Luke Skywalker",
        "Luke",
        endFornecedor,
        "3212121",
        dataNasFunc,
        "321212",
        "321212",
        "luke@reges.edu.br");

    Produto prod1 = new Produto("Coca Cola", 20, "123456", 3, 8,
        "Coca Cola", "123", fornecedor);
    Produto prod2 = new Produto("Guaraná Antartica", 20, "123456", 3, 8,
        "Coca Cola", "123", fornecedor);
    Produto prod3 = new Produto("Fanta Laranja", 20, "123456", 3, 8,
        "Coca Cola", "123", fornecedor);

    Calendar dataVenda = Calendar.getInstance();
    dataVenda.set(Calendar.YEAR, 2023);
    dataVenda.set(Calendar.MONTH, 04);
    dataVenda.set(Calendar.DAY_OF_MONTH, 02);

    Compra compra = new Compra(cliente, funcionario, 12, dataVenda);

    ItemCompra item1 = new ItemCompra(compra, prod1, 15.0, 8);
    ItemCompra item2 = new ItemCompra(compra, prod2, 35.0, 8);
    ItemCompra item3 = new ItemCompra(compra, prod3, 45.0, 8);

    compra.adicionarItemCompra(item1);
    compra.adicionarItemCompra(item2);
    compra.adicionarItemCompra(item3);

    compra.imprimirCupomFiscal();

    // int i = 0;
    // while (i < numCompras) {
    // System.out.println("Digite o número do produto (1, 2 ou 3)");
    // int numProd = sc.nextInt();
    // sc.nextLine();

    // switch (numProd) {
    // case 1:

    // }
    // }

    // DONE
    // Endereco endCliente = new Endereco("Trump Tower", "Fiusa", "123",
    // "Serrana", "SP", "14021615");

    // DONE
    // Calendar dataNascimento = Calendar.getInstance();
    // dataNascimento.set(Calendar.YEAR, 1995);
    // dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
    // dataNascimento.set(Calendar.DAY_OF_MONTH, 20);

    // DONE
    // Cliente cliente = new Cliente("Viuva Negra",
    // "Natasha Romananof",
    // endCliente,
    // "8887877",
    // dataNascimento,
    // "3351212",
    // "3212",
    // "natasha@reges.edu.br",
    // "121212");

    // DONE
    // Endereco endFuncionario = new Endereco("Vingadores Tower",
    // "João Rossi",
    // "9888",
    // "Serrana",
    // "SP",
    // "14021618");

    // DONE
    // Calendar dataNasFunc = Calendar.getInstance();
    // dataNasFunc.set(Calendar.YEAR, 1995);
    // dataNasFunc.set(Calendar.MONTH, Calendar.MARCH);
    // dataNasFunc.set(Calendar.DAY_OF_MONTH, 20);

    // DONE
    // Funcionario funcionario = new Funcionario("Gavião Arqueiro",
    // "Clinton Barton",
    // endFuncionario,
    // "3212121",
    // dataNasFunc,
    // "321212",
    // "321212",
    // "clint@reges.edu.br",
    // 4,
    // 888880,
    // "Arqueiro",
    // 80);

    // DONE
    // Endereco endFornecedor = new Endereco("Reges Tower",
    // "Olhos d'agua",
    // "9888",
    // "Serrana",
    // "SP",
    // "14021618");

    // DONE
    // Calendar dataNasForn = Calendar.getInstance();
    // dataNasForn.set(Calendar.YEAR, 1995);
    // dataNasForn.set(Calendar.MONTH, Calendar.MARCH);
    // dataNasForn.set(Calendar.DAY_OF_MONTH, 20);

    // DONE
    // Fornecedor fornecedor = new Fornecedor("Gavião Arqueiro",
    // "Clinton Barton",
    // endFornecedor,
    // "3212121",
    // dataNasFunc,
    // "321212",
    // "321212",
    // "clint@reges.edu.br");

    // DONE
    // Produto prod1 = new Produto("Cerveja Delirium", 10, "123456", 15, 50,
    // "Ambev", "123", fornecedor);
    // Produto prod2 = new Produto("Samba", 88, "a988478", 2, 53, "Ambev", "123",
    // fornecedor);
    // Produto prod3 = new Produto("Cerveja Samba", 777, "122121", 35, 70, "Ambev",
    // "123", fornecedor);
    // Produto prod4 = new Produto("Cerveja SubZero", 8880, "554546", 55, 80,
    // "Ambev", "123", fornecedor);

    // DONE
    // Compra compra = new Compra(cliente, funcionario, 12, dataVenda);

    // DONE
    // ItemCompra item1 = new ItemCompra(compra, prod1, 15.0, 52.50);
    // ItemCompra item2 = new ItemCompra(compra, prod2, 35.0, 2.50);
    // ItemCompra item3 = new ItemCompra(compra, prod3, 45.0, 5.50);
    // ItemCompra item4 = new ItemCompra(compra, prod4, 55.0, 6.50);

    // compra.adicionarItemCompra(item1);
    // compra.adicionarItemCompra(item2);
    // compra.adicionarItemCompra(item3);
    // compra.adicionarItemCompra(item4);

    // compra.imprimirCupomFiscal();
  }
}
