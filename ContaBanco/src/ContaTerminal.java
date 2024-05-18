import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agenciaConta = scanner.next();
    
        System.out.println("Por favor, digite o Nome do Cliente!");
        String nomeCliente = scanner.next();
        scanner.nextLine();        
        
        System.out.println("Por favor, digite o Saldo da Conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    
    }
}
