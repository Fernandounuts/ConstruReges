
package dominio;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Date dataAtual = new Date();
		// String dataFormatada = sdf.format(dataAtual);
		Calendar calendario = Calendar.getInstance();
		Date dataAtual = calendario.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = sdf.format(dataAtual);

		// ItemCompra item1;
		// ItemCompra item2;
		// ItemCompra item3;
		int qtdProduto;
		int numProd;
		ItemCompra[] ItemCompras = new ItemCompra[3];
		// Endereço do Cliente
		System.out.println("Bom dia, qual seu logradouro?");
		String logradouro = sc.nextLine();
		System.out.println("Qual o seu bairro?");
		String end = sc.nextLine();
		System.out.println("Qual o número de sua casa?");
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
		System.out.print("Digite o dia de seu aniversário: ");
		int dia = sc.nextInt();
		dataNascimento.set(Calendar.DAY_OF_MONTH, dia);

		System.out.println("1 = janeiro\n" +
				"2 = fevereiro\n" +
				"3 = março\n" +
				"4 = abril\n" +
				"5 = maio\n" +
				"6 = junho\n" +
				"7 = julho\n" +
				"8 = agosto\n" +
				"9 = setembro\n" +
				"10 = outubro\n" +
				"11 = novembro\n" +
				"12 = dezembro");

		System.out.print("Digite o seu mês de nascimento:");

		// Mes de Nasc do Cliente
		int mes = sc.nextInt();
		sc.nextLine();
		dataNascimento.set(Calendar.MONTH, mes - 1);

		// Ano de Nasc do Cliente
		System.out.print("Digite qual foi o ano de seu nascimento: ");
		int ano = sc.nextInt();
		sc.nextLine();
		dataNascimento.set(Calendar.YEAR, ano);

		// Dados Cliente
		System.out.print("Digite o seu nome completo: ");
		String nome = sc.nextLine();

		// System.out.println("Qual o seu nome resumido?");
		// String nomeRes = sc.nextLine();

		System.out.print("Digite o seu número telefone: ");
		String telefone = sc.nextLine();

		System.out.print("Digite o seu documento: ");
		String documento = sc.nextLine();

		System.out.print("Digite o seu RG-IE:");
		String rgIe = sc.nextLine();

		System.out.print("Digite o seu Email: ");
		String email = sc.nextLine();

		System.out.println("Digite seu número do cartão fidelidade: ");
		String cartFidel = sc.nextLine();

		Cliente cliente = new Cliente(nome, null, endCliente, telefone, dataNascimento, documento, rgIe, email,
				cartFidel);

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

		// System.out.println("Digite o nome resumido do funcionário:");
		// String nomeFuncRes = sc.nextLine();

		Funcionario funcionario = new Funcionario(
				nomeFunc,
				null,
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

		Produto prod1 = new Produto("Saco de cimento", 100, "123456", 15.00, 30.00,
				"tupi", "123", fornecedor);
		Produto prod2 = new Produto("Caixa D'água 500 litros", 100, "1245631", 100.00, 225.00,
				"Fortlev", "12312341", fornecedor);
		Produto prod3 = new Produto("Cano pvc 25mm 3m", 100, "123451236", 3.00, 10.00,
				"Krona", "123", fornecedor);

		Calendar dataVenda = Calendar.getInstance();
		dataVenda.set(Calendar.YEAR, 2023);
		dataVenda.set(Calendar.MONTH, 04);
		dataVenda.set(Calendar.DAY_OF_MONTH, 02);

		Compra compra = new Compra(cliente, funcionario, 25, dataVenda);

		ItemCompras[0] = new ItemCompra(compra, prod1, 15.0, prod1.getValorVenda());
		ItemCompras[1] = new ItemCompra(compra, prod2, 35.0, prod2.getValorVenda());
		ItemCompras[2] = new ItemCompra(compra, prod3, 45.0, prod3.getValorVenda());
		// Pergunta quantidade de objetos que quer ser comprada
		System.out.println("Quantos objetos você gostaria de comprar (Max de 3)?");
		int quantidadeDeObjetos = sc.nextInt();
		sc.nextLine();
		if (quantidadeDeObjetos < 1 || quantidadeDeObjetos > 3) {
			System.out.println("Quantidade inválida, escolha entre 1 e 3 objetos, por favor.");

		}

		for (int i = 0; i < quantidadeDeObjetos; i++) {
			System.out.println("\n==================================");
			System.out.println("\n1: " + "Saco de Cimento tupi. R$30.00");
			System.out.println("2: " + "Caixa D'água 500 litros. R$225.00");
			System.out.println("3: " + "Cano pvc 25mm 3m. R$10.00\n");
			System.out.println("==================================");
			System.out.print("Digite o número do objeto " + (i + 1) + ": ");
			numProd = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite a quantidade de produtos que desejaria comprar: ");
			qtdProduto = sc.nextInt();
			sc.nextLine();
			// ItemCompras[numProd - 1].setQtd(qtdProduto);
			ItemCompras[numProd - 1].setSubTotal(qtdProduto * ItemCompras[numProd - 1].getValorProduto());
			ItemCompras[numProd - 1].setQtd(qtdProduto);
			compra.adicionarItemCompra(ItemCompras[numProd - 1]);
		}
		sc.close();
		// compra.adicionarItemCompra(ItemCompras[0]);
		// compra.adicionarItemCompra(ItemCompras[1]);
		// compra.adicionarItemCompra(ItemCompras[2]);

		System.out.println("\n\n\n\n");
		System.out.println("\t   CUPOM FISCAL");
		System.out.println("CNPJ: 89.959.090/003-00");
		System.out.println("----------------------------------");
		System.out.println("Data: " + dataAtual);
		System.out.println("----------------------------------");
		compra.imprimirCupomFiscal();

	}
}
