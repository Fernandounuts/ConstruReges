
package dominio;

import java.util.Calendar;

public class Fornecedor extends Pessoa {

  public Fornecedor(String nomeCompleto, String nomeResumido, Endereco endereco, String telefone, Calendar dataNascFund,
      String documento, String rgIe, String email) {
    super(nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe, email);
  }

}
