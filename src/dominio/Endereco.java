
package dominio;

public class Endereco {
    
    private String logradouro;
    private String bairro;
    private String numero;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;

  
    
    public Endereco(String logradouro, String bairro, String numero, String cidade, String uf, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
}
