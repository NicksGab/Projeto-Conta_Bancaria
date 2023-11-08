public class Main {
  
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Gabriel Cavalcante", 22, "999.999.999-99");
    Conta conta = new Conta(cliente, 42, 2325, "Corrente");
    Menu menu = new Menu(conta);

    
    System.out.println("****************************");
    System.out.println("\nNome do cliente: " + conta.getTitular().getNome());
    System.out.println("Tipo conta: " + conta.getTipoConta());
    System.out.println("Saldo atual: " + conta.getSaldo());
    System.out.println("\n****************************\n");


    menu.inicio();
    
    System.out.println("\nOperação finalizada.");
  }
}
