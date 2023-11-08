public class Conta {
  private String tipoConta;
  private int agencia;
  private int numero;
  private double saldo;
  private Cliente titular;

  public Conta(Cliente titular, int agencia, int numero, String tipoConta) {
    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;
    this.tipoConta = tipoConta;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public boolean deposita(double valor){
    if (valor > 0){
      this.saldo += valor;
      return true;
    } else {
      return false;
    }
  }

  public boolean saca(double valor){
    if (this.saldo >= valor && valor > 0){
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public int getAgencia(){
    return this.agencia;
  }

  public int getNumero(){
    return this.numero;
  }

  public Cliente getTitular(){
    return this.titular;
  }

  public String getTipoConta(){
    return this.tipoConta;
  }

}
