public class Cliente {
  private String nome;
  private int idade;
  private String cpf;

  
  public Cliente(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
  }
  
  public String getNome() {
    return this.nome;
  }
  
  public int getIdade() {
    return this.idade;
  }
  
  public String getCpf() {
    return this.cpf;
  }
}
