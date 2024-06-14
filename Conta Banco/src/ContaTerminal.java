import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        // Solicita o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        // Solicita o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        scanner.nextLine(); // Consome a linha pendente
        String nomeCliente = scanner.nextLine();
        
        // Solicita o saldo da conta
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        // Exibe a mensagem com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}
