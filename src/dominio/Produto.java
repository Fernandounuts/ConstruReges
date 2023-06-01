
package dominio;

public class Produto {

	private String nome;
	private double quantidade;
	private String codigoBarra;
	private double valorCusto;
	private double valorVenda;
	private String marca;
	private String ncm;
	private Fornecedor fornecedor;

	public Produto(String nome, double quantidade, String codigoBarra, double valorCusto, double valorVenda,
			String marca,
			String ncm, Fornecedor fornecedor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.codigoBarra = codigoBarra;
		this.valorCusto = valorCusto;
		this.valorVenda = valorVenda;
		this.ncm = ncm;
		this.marca = marca;
		this.fornecedor = fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
