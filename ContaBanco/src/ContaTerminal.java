import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Por gentileza, digite seu Nome");

            nomeCliente = scan.next();
            System.out.println("Por gentileza, digite o Numero da conta");
            numero = scan.nextInt();
            System.out.println("Por gentileza, digite o numero da Agencia !");
            agencia = scan.next();
            System.out.println("Por gentileza, digite seu Saldo");
            saldo = scan.nextFloat();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        } catch (InputMismatchException e) {
            System.out.println("O campo de Conta e saldo devem ser somente números");
        }
    }
}
