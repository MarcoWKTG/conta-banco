import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        double saldo = 237.48;
        String agencia, nome_Cliente;
        
        System.out.println("Por favor, digite o seu nome");
        nome_Cliente = leitor.next();
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = leitor.next();
        
        System.out.println("Informe o número da sua conta");
        numero = leitor.nextInt();
        
        System.out.println("Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
