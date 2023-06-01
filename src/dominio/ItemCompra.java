
package dominio;

public class ItemCompra {

	private Compra compra;
	private Produto produto;
	private double qtd;
	private double valorProduto;
	private double subTotal;

	public ItemCompra(Compra compra, Produto produto, double qtd, double valorProduto) {
		this.compra = compra;
		this.produto = produto;
		this.qtd = qtd;
		this.valorProduto = valorProduto;
		this.subTotal = this.qtd * this.valorProduto;

	}

	public Compra getCompra() {
		return compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public double getQtd() {
		return qtd;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

}
