import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o número da agência: ");
            String agencia = scanner.next();
            
            System.out.println("Digite o número da conta: ");
            int conta = scanner.nextInt();
            
            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite o seu saldo: R$ ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " , conta " + conta + " e seu saldo é R$ " + saldo + " e já está disponível para saque.");
        
            scanner.close();
    }
}
