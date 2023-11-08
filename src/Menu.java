import java.util.Scanner;

public class Menu {
  boolean resposta;
  double valor;
  int opcao = -1;
  private Conta conta;
  Scanner leitura = new Scanner(System.in);
  String menuInicial;

  public Menu(Conta conta){
    this.conta = conta;
  }
  
  public void inicio(){
    
    menuInicial = """

        ** Digite sua opção **
        1 - Consultar saldo
        2 - Sacar valor
        3 - Depositar valor
        0 - sair
        """;


    while (opcao != 0) {
      System.out.println(menuInicial);
      opcao = leitura.nextInt();

      switch (opcao) {
        case 1:
          MenuMostraSaldo();
          break;
        case 2:
          MenuSacaSaldo();
          break;
        case 3:
          MenuDepositaSaldo();
          break;
        default:
          System.out.println("Digite uma opção válida.");
          break;
      }
    }
  }
  
  
  private void MenuMostraSaldo(){
    System.out.println("Saldo atualizado: R$" + this.conta.getSaldo());
  }


  private void MenuSacaSaldo(){
    System.out.println("Qual o valor que deseja sacar?");
    MenuMostraSaldo();

    valor = leitura.nextDouble();

    if(valor > this.conta.getSaldo()){
      System.out.println("Saldo insuficiente!");
      return;
    }

    resposta = this.conta.saca(valor);

    if(resposta){
      System.out.println("Operação concluida.");
      MenuMostraSaldo();
    } else {
      System.out.println("Falha na operação. Insira um valor válido para saque!");
    }
  }

  private void MenuDepositaSaldo(){
    System.out.println("Quanto deseja depositar?");
    valor = leitura.nextDouble();

    resposta = this.conta.deposita(valor);
  
    if(resposta){
      System.out.println("Valor depositado com sucesso!");
      MenuMostraSaldo();
    } else {
      System.out.println("Insira um valor válido para deposito!");
    }
  }
}