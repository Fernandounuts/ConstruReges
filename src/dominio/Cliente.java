package dominio;

import java.util.Calendar;

public class Cliente extends Pessoa {

  private String cartaoFidelidade;

  public Cliente(String nomeCompleto, String nomeResumido, Endereco endereco, String telefone, Calendar dataNascFund,
      String documento, String rgIe, String email, String cartaoFidelidade) {
    super(nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe, email);
    this.cartaoFidelidade = cartaoFidelidade;
  }

}
