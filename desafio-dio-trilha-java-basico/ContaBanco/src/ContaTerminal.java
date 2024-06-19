import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada

         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo = 0f;

        System.out.print("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.print("Por favor, digite o número da sua agência: ");
        agencia = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Por favor, digite o seu nome completo: ");
        nomeCliente = scanner.nextLine();       
        System.out.print("Por favor, informe o valor que você depositará para a criação da sua conta: ");
        saldo = scanner.nextFloat();        

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, o número da sua agência é " + agencia + " o número da sua conta é " + numeroConta + " e seu saldo atual de: " + saldo + " já está disponível para saque!");

        scanner.close();
    }
    
}