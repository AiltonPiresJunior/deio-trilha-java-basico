import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero;
        String agencia;
        String nomeCliente;
        Float saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por gentileza, digite seu Nome");
        nomeCliente = scan.next();
        System.out.println("Por gentileza, digite o Numero da conta");
        numero = scan.nextInt();
        System.out.println("Por gentileza, digite o numero da Agencia !");
        agencia = scan.next();
        System.out.println("Por gentileza, digite seu Saldo");
        saldo = scan.nextFloat();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo));

    }
}
